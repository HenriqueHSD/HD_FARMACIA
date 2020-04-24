/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import DAO.EncomendaDAO;
import hd_bean.HD_Encomenda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 201816882
 */
public class HD_Form_Encomenda extends JPanel implements ActionListener{

    private JTextField nomec;
    private JTextField nomer;
    private JTextField endereco;
    private JTextField telefone;
    private JTextField composicao;
    private JTextField valor;
    private JButton botao;
    

public HD_Form_Encomenda(){
    
        JLabel label_nomec = new JLabel("Nome Cliente : ");
        add(label_nomec);
        nomec = new JTextField(5);
        add(nomec);
        
        JLabel label_nomer = new JLabel("Nome Remedio : ");
        add(label_nomer);
        nomer = new JTextField(5);
        add(nomer);
        
        JLabel label_endereco = new JLabel("Endereço : ");
        add(label_endereco);        
        endereco = new JTextField(5); 
        add(endereco);
        
        JLabel label_telefone = new JLabel("Telefone : ");
        add(label_telefone);
        telefone = new JTextField(5);
        add(telefone);
        
        JLabel label_composicao = new JLabel("Composição : ");
        add(label_composicao);
        composicao = new JTextField(5);
        add(composicao);
                
        JLabel label_valor = new JLabel("Valor : ");
        add(label_valor);
        valor = new JTextField(5);
        add(valor);
        
        
        botao = new JButton ("Cadastra");
        botao.addActionListener(this);
        add(botao);

}

    @Override
    public void actionPerformed(ActionEvent e) {
    
    String Valor_nomec = nomec.getText();
    String Valor_nomer = nomer.getText();
    String Valor_endereco = endereco.getText();
    int Valor_telefone = Integer.parseInt(telefone.getText());
    String Valor_composicao = composicao.getText();
    double Valor_valor = Double.parseDouble(valor.getText());
    
    HD_Encomenda en = new HD_Encomenda();
    en.setNome(Valor_nomec);
    en.setNomeR(Valor_nomer);
    en.setEndereco(Valor_endereco);
    en.setTelefone(Valor_telefone);
    en.setComposicao(Valor_composicao);
    en.setValor(Valor_valor);
    
    EncomendaDAO.adicionar(en);
    }
}
