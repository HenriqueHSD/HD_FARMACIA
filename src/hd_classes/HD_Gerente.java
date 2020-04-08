/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_classes;

/**
 *
 * @author Henrique
 */
public class HD_Gerente extends HD_Funcionario {
    //atributos
    private String HD_G_Usuario;
    private String HD_G_Senha;
 //set e get       
    public void setUsuario (String HD_G_Usuario){
    this.HD_G_Usuario = this.HD_G_Usuario;
    }       public String getUsuario(){
            return this.HD_G_Usuario;
    }

    public void setSenha (String HD_G_Senha){
    this.HD_G_Senha = this.HD_G_Senha;
    }       public String getSenha(){
            return this.HD_G_Senha;
    }

public HD_Gerente(String HD_G_N, int HD_G_I, String HD_G_C, String HD_G_E, double HD_G_Sa ,String HD_G_U, String HD_G_Se){
    this.HD_F_Nome = HD_G_N;
    this.HD_F_Idade = HD_G_I;
    this.HD_F_CPF = HD_G_C;
    this.HD_F_Endereco = HD_G_E;
    this.HD_F_Salario = HD_G_Sa;
    this.HD_G_Usuario = HD_G_U;
    this.HD_G_Senha = HD_G_Se;
}

    @Override
    public double Taxa() {
        return this.HD_F_Salario + (this.HD_F_Salario *(20/100));
    }



}
