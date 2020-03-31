/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import hd_classes.HD_Gerente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Henrique
 */
public class HD_Form_Gerente extends JPanel implements ActionListener{
    private JTextField nome;
    private JTextField idade;
    private JTextField cpf;
    private JTextField endereco;
    private JTextField salario;
    private JTextField usuario;
    private JTextField senha;
    private JButton botao;
    
    
public HD_Form_Gerente(){
    JLabel label_nome = new JLabel("Nome : ");
        add(label_nome);
        nome = new JTextField(5);
        add(nome);
        
        JLabel label_idade = new JLabel("Idade : ");
        add(label_idade);        
        idade = new JTextField(5); 
        add(idade);
        
        JLabel label_cpf = new JLabel("CPF : ");
        add(label_cpf);
        cpf = new JTextField(5);
        add(cpf);
        
        JLabel label_endereco = new JLabel("Endereço : ");
        add(label_endereco);
        endereco = new JTextField(5);
        add(endereco);
                
        JLabel label_salario = new JLabel("Salario : ");
        add(label_salario);
        salario = new JTextField(5);
        add(salario);
        
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
    
    String Valor_nome = nome.getText();
    int Valor_idade = Integer.parseInt(idade.getText());
    int Valor_cpf = Integer.parseInt(cpf.getText());
    String Valor_endereco = endereco.getText();
    double Valor_salario = Double.parseDouble(salario.getText());
    String Valor_usuario = usuario.getText();
    String Valor_senha = senha.getText();
    
    HD_Gerente gerente = new HD_Gerente(Valor_nome, Valor_idade, Valor_cpf, Valor_endereco, Valor_salario, Valor_usuario, Valor_senha);
    
    String texto = "nome digitado é:"+gerente.getNome()+
    "\nidade digitado é:"+gerente.getIdade()+
    "\ncpf digitado é:"+gerente.getCPF()+
    "\nendereco digitado é:"+gerente.getEndereco()+
    "\nsalario digitado é:"+gerente.getSalario()+
    "\nusuario digitado é:"+gerente.getUsuario()+
    "\nsenha digitado é:"+gerente.getSenha();
    
    JOptionPane.showMessageDialog(null, texto);
        
    }
    
    
    
    
}
