/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import DAO.GerenteDAO;
import static hd_Layout.HD_Janela.centro;
import hd_bean.HD_Gerente;
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
public class listaGerente extends JPanel{
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
    private JTable tabela;
    private String[]colunas = {"USUARIO", "SENHA"};
    private Object[][] dados;
    
    DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
    
    public listaGerente(){
        botaoAdicionar = new JButton("Adicionar");
        botaoEditar = new JButton("Editar");
        botaoExcluir = new JButton("Excluir");
        
        botaoAdicionar.addActionListener(new AdicionarListener());
        botaoEditar.addActionListener(new EditarListener());
        botaoExcluir.addActionListener(new ExcluirListener());
        
        tabela = new JTable(modelo);
        
        ArrayList<HD_Gerente> ge = GerenteDAO.listar();
        
        for(HD_Gerente gerente: ge){ 
            String usu = gerente.getUsuario();
            String sen = gerente.getSenha();
            
            String[] linha = new String[]{usu,sen};
            
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
            centro.add(new HD_Form_Gerente());   
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
    

