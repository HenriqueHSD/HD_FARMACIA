/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import DAO.ClienteDAO;
import static hd_Layout.HD_Janela.centro;
import hd_bean.HD_Cliente;
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
public class listaCliente extends JPanel{
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
    private JTable tabela;
    private String[]colunas = {"NOME", "CPF", "TELEFONE", "ENDERECO", "EMAIL"};
    private Object[][] dados;
    
    DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
    
    public listaCliente(){
        botaoAdicionar = new JButton("Adicionar");
        botaoEditar = new JButton("Editar");
        botaoExcluir = new JButton("Excluir");
        
        botaoAdicionar.addActionListener(new AdicionarListener());
        botaoEditar.addActionListener(new EditarListener());
        botaoExcluir.addActionListener(new ExcluirListener());
        
        tabela = new JTable(modelo);
        
        ArrayList<HD_Cliente> c = ClienteDAO.listar();
        
        for(HD_Cliente cliente: c){ 
            String nome = cliente.getNome();
            String cpf = cliente.getCPF();
            String tele = Integer.toString(cliente.getTelefone());
            String en = cliente.getEndereco();
            String em = cliente.getEmail();
            
            String[] linha = new String[]{nome,cpf,tele,en,em};
            
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
            centro.add(new HD_Form_Cliente());   
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
