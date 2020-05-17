/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Layout;


import static hd_Layout.HD_Janela.centro;

import hd_Views.listaCliente;
import hd_Views.listaConsulta;
import hd_Views.listaEncomenda;
import hd_Views.listaGerente;
import hd_Views.listaRemedio;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        butao1.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent arg0) {
          centro.removeAll(); 
          centro.add(new listaCliente());
          centro.repaint();
          centro.validate();
          }
      });
        butao2.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent arg0) {
          centro.removeAll(); 
          centro.add(new listaConsulta());
          centro.repaint();
          centro.validate();
          }
      });
        butao3.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent arg0) {
          centro.removeAll(); 
          centro.add(new listaEncomenda());
          centro.repaint();
          centro.validate();
          }
      });
        butao4.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent arg0) {
          centro.removeAll(); 
          centro.add(new listaRemedio());
          centro.repaint();
          centro.validate();
          }
      });
        butao5.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent arg0) {
          centro.removeAll(); 
          centro.add(new listaGerente());
          centro.repaint();
          centro.validate();
          }
      });
        
        add(butao1);
        add(butao2);
        add(butao3);
        add(butao4);
        add(butao5);
            
  }  
}
