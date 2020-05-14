/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_Layout;

import hd_Views.HD_Form_Cliente;
import hd_Views.HD_Form_Consulta;
import hd_Views.HD_Form_Encomenda;
import hd_Views.HD_Form_Gerente;
import hd_Views.HD_Form_Remedio;
import hd_Views.listaCliente;
import javax.swing.JPanel;

/**
 *
 * @author 201816882
 */
public class HD_Centro extends JPanel {
    public HD_Centro(){
    add(new listaCliente());

    }
    
}
