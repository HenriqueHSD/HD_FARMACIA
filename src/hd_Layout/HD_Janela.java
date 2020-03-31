/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Layout;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author 201816882
 */
public class HD_Janela extends JFrame {
    public HD_Janela(){
        super("Redde Minus");
        setLayout(new BorderLayout());
        getContentPane().add(new HD_Topo(), BorderLayout.NORTH);
        getContentPane().add(new HD_Centro(), BorderLayout.CENTER);
        pack();
        show();
  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    
    }
}
