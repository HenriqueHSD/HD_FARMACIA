/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Layout;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author 201816882
 */
public class HD_Topo extends JPanel{
  public HD_Topo(){
      setLayout(new GridLayout(1,5));
        JButton butao1 = new JButton("Cliente");
        JButton butao2 = new JButton("Consulta Medica");
        JButton butao3 = new JButton("Encomenda Cosmetico");
        JButton butao4 = new JButton("Remedio");
        JButton butao5 = new JButton("Gerente");
        
        add(butao1);
        add(butao2);
        add(butao3);
        add(butao4);
        add(butao5);
            
  }  
}
