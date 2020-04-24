/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_bean;

/**
 *
 * @author 201816882
 */
public abstract class HD_Funcionario {
    //atributos
    protected String HD_F_Nome;
    protected int HD_F_Idade;
    protected String HD_F_CPF;
    protected String HD_F_Endereco;
    protected double HD_F_Salario;
                    
     //get e set               
    public void setNome(String HD_F_Nome){
    this.HD_F_Nome = HD_F_Nome;
    }       public String getNome(){
            return this.HD_F_Nome;
        }
    
    public void setIdade(int HD_F_Idade){
    this.HD_F_Idade = HD_F_Idade;
    }       public int getIdade(){
            return this.HD_F_Idade;
    }
    
    public void setCPF(String HD_F_CPF){
    this.HD_F_CPF = HD_F_CPF;
    }       public String getCPF(){
            return this.HD_F_CPF;
    }
    
    public void seteEndereco(String HD_F_Endereco){
    this.HD_F_Endereco = HD_F_Endereco;
    }       public String getEndereco(){
            return this.HD_F_Endereco;
        }
    
    public void setSalario(double HD_F_Salario){
    this.HD_F_Salario = HD_F_Salario; 
    }       public double getSalario(){
            return this.HD_F_Salario;
    }
    
    
    
    public abstract double Taxa();
}
