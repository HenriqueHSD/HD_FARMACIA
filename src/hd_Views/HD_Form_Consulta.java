/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import DAO.ConsultaDAO;
import hd_bean.HD_Consulta;
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
public class HD_Form_Consulta extends JPanel implements ActionListener{
    private JTextField nome;
    private JTextField idade;
    private JTextField pressao;
    private JTextField sexo;
    private JTextField peso;
    private JTextField altura;
    private JButton botao;
    
public HD_Form_Consulta(){
    
        JLabel label_nome = new JLabel("Nome : ");
        add(label_nome);
        nome = new JTextField(5);
        add(nome);
        
        JLabel label_idade = new JLabel("Idade : ");
        add(label_idade);        
        idade = new JTextField(5); 
        add(idade);
        
        JLabel label_pressao = new JLabel("Pressao : ");
        add(label_pressao);
        pressao = new JTextField(5);
        add(pressao);
        
        JLabel label_sexo = new JLabel("Sexo : ");
        add(label_sexo);
        sexo = new JTextField(5);
        add(sexo);
                
        JLabel label_peso = new JLabel("Peso : ");
        add(label_peso);
        peso = new JTextField(5);
        add(peso);
        
         JLabel label_altura = new JLabel("Altura : ");
        add(label_altura);
        altura = new JTextField(5);
        add(altura);
        
        botao = new JButton ("Cadastra");
        botao.addActionListener(this);
        add(botao);


}
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    String Valor_nome = nome.getText();
    int Valor_idade = Integer.parseInt(idade.getText());
    double Valor_pressao = Double.parseDouble(pressao.getText());
    String Valor_sexo = sexo.getText();
    double Valor_peso = Double.parseDouble(peso.getText());
    double Valor_altura = Double.parseDouble(altura.getText());
    
    HD_Consulta co = new HD_Consulta();
    co.setNome(Valor_nome);
    co.setIdade(Valor_idade);
    co.setPressao(Valor_pressao);
    co.setSexo(Valor_sexo);
    co.setPeso(Valor_peso);
    co.setAltura(Valor_altura);
    
    ConsultaDAO.adicionar(co);
    }
}
