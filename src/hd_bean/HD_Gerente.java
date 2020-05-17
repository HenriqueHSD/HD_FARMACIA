/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_bean;

import DAO.GerenteDAO;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class HD_Gerente{ 
    //atributos
    protected String Usuario;
    protected String Senha;
 //set e get       

    public HD_Gerente() {
        
    }
    
    public ArrayList<HD_Gerente> listar(){
        return GerenteDAO.listar();
        
    }
    public void setUsuario (String Usuario){
    this.Usuario = this.Usuario;
    }       public String getUsuario(){
            return this.Usuario;
    }

    public void setSenha (String Senha){
    this.Senha = this.Senha;
    }       public String getSenha(){
            return this.Senha;
    }

public HD_Gerente(String HD_G_U, String HD_G_Se){
    
    this.Usuario = HD_G_U;
    this.Senha = HD_G_Se;
}




}
