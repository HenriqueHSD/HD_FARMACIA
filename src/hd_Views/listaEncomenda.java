/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import DAO.EncomendaDAO;
import static hd_Layout.HD_Janela.centro;
import hd_bean.HD_Encomenda;
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
public class listaEncomenda extends JPanel{
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
    private JTable tabela;
    private String[]colunas = {"NOME_CLIENTE", "NOME_REMEDIO", "ENDERECO", "TELEFONE", "COMPOSICAO","VALOR"};
    private Object[][] dados;
    
    DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
    
    public listaEncomenda(){
        botaoAdicionar = new JButton("Adicionar");
        botaoEditar = new JButton("Editar");
        botaoExcluir = new JButton("Excluir");
        
        botaoAdicionar.addActionListener(new AdicionarListener());
        botaoEditar.addActionListener(new EditarListener());
        botaoExcluir.addActionListener(new ExcluirListener());
        
        tabela = new JTable(modelo);
        
        ArrayList<HD_Encomenda> enc = EncomendaDAO.listar();
        
        for(HD_Encomenda encomenda: enc){ 
            String nom = encomenda.getNome();
            String nomer = encomenda.getNomeR();
            String en = encomenda.getEndereco();
            String tele = Integer.toString(encomenda.getTelefone());
            String com = encomenda.getComposicao();
            String v = Double.toString(encomenda.getValor());
            
            String[] linha = new String[]{nom,nomer,en,tele,com,v};
            
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
            centro.add(new HD_Form_Encomenda());   
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
    

