/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import DAO.GerenteDAO;
import hd_bean.HD_Gerente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Henrique
 */
public class HD_Form_Gerente extends JPanel implements ActionListener{
   
    private JTextField usuario;
    private JTextField senha;
    private JButton botao;
    
    
public HD_Form_Gerente(){
    
        JLabel label_usuario = new JLabel("Usuario : ");
        add(label_usuario);
        usuario = new JTextField(5);
        add(usuario);
        
        JLabel label_senha = new JLabel("Senha : ");
        add(label_senha);
        senha = new JTextField(5);
        add(senha);
        
        botao = new JButton ("Cadastra");
        botao.addActionListener(this);
        add(botao);
}

    @Override
    public void actionPerformed(ActionEvent e) {
  
    String Valor_usuario = usuario.getText();
    String Valor_senha = senha.getText();
    
    HD_Gerente ger = new HD_Gerente();
    ger.setUsuario(Valor_usuario);
    ger.setSenha(Valor_senha);
    
    GerenteDAO.adicionar(ger);
        
    }
    
    
    
    
}
