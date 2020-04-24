/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import DAO.ClienteDAO;
import hd_classes.HD_Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
//import javax.swing.JOptionPane; uma pequena tela
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Henrique
 */
public class HD_Form_Cliente extends JPanel implements ActionListener{
    private JTextField nome;
    private JTextField cpf;
    private JTextField telefone;
    private JTextField endereco;
    private JTextField email;
    private JButton botao;

public HD_Form_Cliente(){

    JLabel label_nome = new JLabel("Nome : ");
        add(label_nome);
        nome = new JTextField(5);
        add(nome);
        
        JLabel label_cpf = new JLabel("CPF : ");
        add(label_cpf);        
        cpf = new JTextField(5); 
        add(cpf);
        
        JLabel label_telefone = new JLabel("Telefone : ");
        add(label_telefone);
        telefone = new JTextField(5);
        add(telefone);
        
        JLabel label_endereco = new JLabel("Endereço : ");
        add(label_endereco);
        endereco = new JTextField(5);
        add(endereco);
                
        JLabel label_email = new JLabel("Email : ");
        add(label_email);
        email = new JTextField(5);
        add(email);
        
        botao = new JButton ("Cadastra");
        botao.addActionListener(this);
        add(botao);
}    

    @Override
    public void actionPerformed(ActionEvent e) {
    
    String Valor_nome = nome.getText();
    String Valor_cpf = cpf.getText();
    int Valor_telefone = Integer.parseInt( telefone.getText());
    String Valor_endereco = endereco.getText();
    String Valor_email = email.getText();
    
    HD_Cliente c = new HD_Cliente();
    c.setNome(Valor_nome);
    c.setCPF(Valor_cpf);
    c.setTelefone(Valor_telefone);
    c.setEndereco(Valor_endereco);
    c.setEmail(Valor_email);
    
    ClienteDAO.adicionar(c);
    
    }
        
    }
    

