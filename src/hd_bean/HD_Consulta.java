/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_bean;

/**
 *
 * @author Henrique
 */
public class HD_Consulta {
    //atributos
    protected String HD_CO_Nome;
    protected int HD_CO_Idade;
    protected double HD_CO_Pressao;
    protected String HD_CO_Sexo;
    protected double HD_CO_Peso;
    protected double HD_CO_Altura;

    public HD_Consulta() {
        
    }
                            
//set e get
    public void setNome(String HD_CO_Nome){
    this.HD_CO_Nome = HD_CO_Nome;
        }       public String getNome(){
                return this.HD_CO_Nome;
            }

    public void setIdade(int HD_CO_Idade){
    this.HD_CO_Idade = HD_CO_Idade;
        }       public int getIdade(){
                return this.HD_CO_Idade;
            }

    public void setPressao(double HD_CO_Pressao){
    this.HD_CO_Pressao = HD_CO_Pressao;
        }       public double getPressao(){
                return this.HD_CO_Pressao;
            }

    public void setSexo(String HD_CO_Sexo){
    this.HD_CO_Sexo = HD_CO_Sexo;
        }       public String getSexo(){
                return this.HD_CO_Sexo;
            }    

    public void setPeso(double HD_CO_Peso){
    this.HD_CO_Peso = HD_CO_Peso;
        }       public double getPeso(){
                return this.HD_CO_Peso;
            }

    public void setAltura(double HD_CO_Altura){
    this.HD_CO_Altura = HD_CO_Altura;
        }       public double getAltura(){
                return this.HD_CO_Altura;
            }    

public HD_Consulta(String HD_CO_N, int HD_CO_I, double HD_CO_Pr, String HD_CO_S, double HD_CO_Pe, double HD_CO_A){
    this.HD_CO_Nome = HD_CO_N;
    this.HD_CO_Idade = HD_CO_I;
    this.HD_CO_Pressao = HD_CO_Pr;
    this.HD_CO_Sexo = HD_CO_S;
    this.HD_CO_Peso = HD_CO_Pe;
    this.HD_CO_Altura = HD_CO_A;
        
}
    
      

public double PIM (){   
    return HD_CO_Peso = (72.2 * HD_CO_Altura) - 58;  
}

public double PIF(){
    return HD_CO_Peso = (62.1 * HD_CO_Altura) - 44.7;  
}


}



