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
    public static HD_Centro centro = new HD_Centro();
    public HD_Janela(){
        super("Redde Minus");
        setLayout(new BorderLayout());
        getContentPane().add(new HD_Topo(), BorderLayout.NORTH);
        getContentPane().add(centro, BorderLayout.CENTER);
        getContentPane().add(new HD_Rodape(), BorderLayout.SOUTH);
        getContentPane().add(new HD_Esquerda(), BorderLayout.EAST);
        getContentPane().add(new HD_Direita(), BorderLayout.WEST);
        pack();
        show();
  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    
    }
}
