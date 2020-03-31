/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import hd_classes.HD_Encomenda;
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
    
    HD_Encomenda encomenda = new HD_Encomenda(Valor_nomec, Valor_nomer, Valor_endereco, Valor_telefone, Valor_composicao, Valor_valor);
    
    String texto = "nome do cliente digitado é:"+encomenda.getNome()+
    "\nnome do remedio digitado é:"+encomenda.getNomeR()+
    "\nendereço digitado é:"+encomenda.getEndereco()+
    "\ntelefone digitado é:"+encomenda.getTelefone()+
    "\ncomposição digitado é:"+encomenda.getComposicao()+
    "\nvalor digitado é:"+encomenda.getValor();
    
    JOptionPane.showMessageDialog(null, texto);
    
    }
}
