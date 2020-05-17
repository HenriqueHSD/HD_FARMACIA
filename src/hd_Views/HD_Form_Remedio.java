/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Views;


import DAO.RemedioDAO;
import hd_bean.HD_Remedio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HD_Form_Remedio extends JPanel implements ActionListener{
         
    private JTextField nome;
    private JTextField vencimento;
    private JTextField quantidade;
    private JTextField tipo;
    private JTextField valor;
    private JButton botao;
    
    public HD_Form_Remedio(){
        
        JLabel label_nome = new JLabel("Nome : ");
        add(label_nome);
        nome = new JTextField(10);
        add(nome);
        
        JLabel label_vencimento = new JLabel("Vencimento : ");
        add(label_vencimento);        
        vencimento = new JTextField(10); 
        add(vencimento);
        
        JLabel label_quantidade = new JLabel("Quantidade : ");
        add(label_quantidade);
        quantidade = new JTextField(10);
        add(quantidade);
        
        JLabel label_tipo = new JLabel("Tipo : ");
        add(label_tipo);
        tipo = new JTextField(10);
        add(tipo);
                
        JLabel label_valor = new JLabel("Valor : ");
        add(label_valor);
        valor = new JTextField(10);
        add(valor);
        
        
        
        
        botao = new JButton ("Cadastra");
        botao.addActionListener(this);
        add(botao);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     
    String Valor_nome = nome.getText();
    String Valor_vencimento = vencimento.getText();
    int Valor_quantidade = Integer.parseInt(quantidade.getText());
    String Valor_tipo = tipo.getText();
    double Valor_valor = Double.parseDouble(valor.getText());
    
    HD_Remedio re = new HD_Remedio();
    re.setNome(Valor_nome);
    re.setVencimento(Valor_vencimento);
    re.setQuantidade(Valor_quantidade);
    re.setTipo(Valor_tipo);
    re.setValor(Valor_valor);
    
    RemedioDAO.adicionar(re);
    }

    
    
    
    
}
