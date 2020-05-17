/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_bean;

import DAO.RemedioDAO;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class HD_Remedio {
    //atributos
    protected String HD_R_Nome;
    protected String HD_R_Vencimento;
    protected int HD_R_Quantidade;
    protected String HD_R_Tipo;
    protected double HD_R_Valor;

    public HD_Remedio() {
        
    }
    public ArrayList<HD_Remedio> listar(){
        return RemedioDAO.listar();
        
    }
//set e get                    
    public void setNome(String HD_R_Nome){
    this.HD_R_Nome = HD_R_Nome;
        }       public String getNome(){
                return this.HD_R_Nome;
            }


    public void setVencimento(String HD_R_Vencimento){
    this.HD_R_Vencimento = HD_R_Vencimento;
        }       public String getVencimento(){
                return this.HD_R_Vencimento;
            }

    public void setQuantidade(int HD_R_Quantidade){
    this.HD_R_Quantidade = HD_R_Quantidade;
        }       public int getQuantidade(){
                return this.HD_R_Quantidade;
            }

    public void setTipo(String HD_R_Tipo){
    this.HD_R_Tipo = HD_R_Tipo;
        }       public String getTipo(){
                return this.HD_R_Tipo;
            }

    public void setValor(double HD_R_Valor){
    this.HD_R_Valor = HD_R_Valor;
        }       public double getValor(){
                return this.HD_R_Valor;
            }

public HD_Remedio(String HD_R_N, String HD_R_Ve, int HD_R_Q, String HD_R_T, double HD_R_Va){
    this.HD_R_Nome = HD_R_N;
    this.HD_R_Vencimento = HD_R_Ve;
    this.HD_R_Quantidade = HD_R_Q;
    this.HD_R_Tipo = HD_R_T;
    this.HD_R_Valor = HD_R_Va;
}
    
}



