/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;

import hd_classes.HD_Consulta;
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
    
    HD_Consulta consulta = new HD_Consulta(Valor_nome, Valor_idade, Valor_pressao, Valor_sexo, Valor_peso, Valor_altura);
    
    String texto = "nome digitado é:"+consulta.getNome()+
    "\n idade digitado é:"+consulta.getIdade()+
    "\n pressao digitado é:"+consulta.getPressao()+
    "\n sexo digitado é:"+consulta.getSexo()+
    "\n peso digitado é:"+consulta.getPeso()+
     "\n altura digitado é:"+consulta.getAltura();
    
    JOptionPane.showMessageDialog(null, texto);
    
    }
}
