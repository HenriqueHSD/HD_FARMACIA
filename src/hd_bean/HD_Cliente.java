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
public class HD_Cliente {
    //atributos
    protected String HD_C_Nome;
    protected String HD_C_CPF;
    protected int HD_C_Telefone;
    protected String HD_C_Endereco;
    protected String HD_C_Email;

    public HD_Cliente() {
        
    }

    
//set e get
    public void setNome(String HD_C_Nome){
    this.HD_C_Nome = HD_C_Nome;
        }       public String getNome(){
                return this.HD_C_Nome;
            }

    public void setCPF(String HD_C_CPF){
    this.HD_C_CPF = HD_C_CPF;
        }       public String getCPF(){
                return this.HD_C_CPF;
            }

    public void setTelefone(int HD_C_Telefone){
    this.HD_C_Telefone = HD_C_Telefone;
        }       public int getTelefone(){
                return this.HD_C_Telefone;
            }

    public void setEndereco(String HD_C_Endereco){
    this.HD_C_Endereco = HD_C_Endereco;
        }       public String getEndereco(){
                return this.HD_C_Endereco;
            }

    public void setEmail(String HD_C_Email){
    this.HD_C_Email = HD_C_Email;
        }       public String getEmail(){
                return this.HD_C_Email;
            }    
    
   public HD_Cliente (String HD_C_N, String HD_C_C, int HD_C_T, String HD_C_En, String HD_C_Em){
        this.HD_C_Nome = HD_C_N;
        this.HD_C_CPF = HD_C_C;
        this.HD_C_Telefone = HD_C_T;
        this.HD_C_Endereco = HD_C_En;
        this.HD_C_Email = HD_C_Em;
    }
    
}

