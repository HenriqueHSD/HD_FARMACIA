/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import DAO.ConsultaDAO;
import static hd_Layout.HD_Janela.centro;
import hd_bean.HD_Consulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Henrique
 */
public class listaConsulta extends JPanel{
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
    private JTable tabela;
    private String[]colunas = {"NOME", "IDADE", "PRESSAO", "SEXO", "PESO", "ALTURA"};
    private Object[][] dados;
    
    DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
    
    public listaConsulta(){
        botaoAdicionar = new JButton("Adicionar");
        botaoEditar = new JButton("Editar");
        botaoExcluir = new JButton("Excluir");
        
        botaoAdicionar.addActionListener(new AdicionarListener());
        botaoEditar.addActionListener(new EditarListener());
        botaoExcluir.addActionListener(new ExcluirListener());
        
        tabela = new JTable(modelo);
        
        ArrayList<HD_Consulta> co = ConsultaDAO.listar();
        
        for(HD_Consulta consulta: co){ 
            String nome = consulta.getNome();
            String ida = Integer.toString(consulta.getIdade());
            String pr = Double.toString(consulta.getPressao());
            String se = consulta.getSexo();
            String pe = Double.toString(consulta.getPeso());
            String al = Double.toString(consulta.getAltura());
            
            String[] linha = new String[]{nome,ida,pr,se,pe,al};
            
            modelo.addRow(linha);
        }
        add(tabela);
        
        add(botaoAdicionar);
        add(botaoEditar);
        add(botaoExcluir);
    }
     private static class AdicionarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            centro.removeAll();
            centro.add(new HD_Form_Consulta());   
            centro.repaint();                 
            centro.validate();
        }
    }
    private static class EditarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {}
    }

    private static class ExcluirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {}
    } 
}
    

