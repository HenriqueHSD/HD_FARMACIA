/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import DAO.RemedioDAO;
import static hd_Layout.HD_Janela.centro;
import hd_bean.HD_Remedio;
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
public class listaRemedio extends JPanel{
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
    private JTable tabela;
    private String[]colunas = {"NOME", "VENCIMENTO", "QUANTIDADE", "TIPO", "VALOR"};
    private Object[][] dados;
    
    DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
    
    public listaRemedio(){
        botaoAdicionar = new JButton("Adicionar");
        botaoEditar = new JButton("Editar");
        botaoExcluir = new JButton("Excluir");
        
        botaoAdicionar.addActionListener(new AdicionarListener());
        botaoEditar.addActionListener(new EditarListener());
        botaoExcluir.addActionListener(new ExcluirListener());
        
        tabela = new JTable(modelo);
        
        ArrayList<HD_Remedio> re = RemedioDAO.listar();
        
        for(HD_Remedio remedio: re){ 
            String nome = remedio.getNome();
            String ven = Integer.toString(remedio.getVencimento());
            String qua = Integer.toString(remedio.getQuantidade());
            String ti = remedio.getTipo();
            String vl = Double.toString(remedio.getValor());
            
            String[] linha = new String[]{nome,ven,qua,ti,vl};
            
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
            centro.add(new HD_Form_Remedio());   
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
    

