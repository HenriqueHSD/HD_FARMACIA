/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hd_bean;

import DAO.EncomendaDAO;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class HD_Encomenda {
    //atributos
    protected String HD_E_NomeC;
    protected String HD_E_NomeR;
    protected String HD_E_Endereco;
    protected int HD_E_Telefone;               
    protected String HD_E_Composicao;
    protected double HD_E_Valor;

    public HD_Encomenda() {
        
    }
    
    public ArrayList<HD_Encomenda> listar(){
        return EncomendaDAO.listar();
        
    }
//set e get
    public void setNome(String HD_E_NomeC){
    this.HD_E_NomeC = HD_E_NomeC;
    }       public String getNome(){
            return this.HD_E_NomeC;
    }

    public void setNomeR(String HD_E_NomeR){
    this.HD_E_NomeR = HD_E_NomeR;
    }       public String getNomeR(){
            return this.HD_E_NomeR;
    }

    public void setEndereco (String HD_E_Endereco){
    this.HD_E_Endereco = HD_E_Endereco;
    }       public String getEndereco(){
            return this.HD_E_Endereco;
    }

    public void setTelefone(int HD_E_Telefone){
    this.HD_E_Telefone = HD_E_Telefone;
    }       public int getTelefone(){
            return this.HD_E_Telefone;
    }

    public void setComposicao(String HD_E_Composicao){
    this.HD_E_Composicao = HD_E_Composicao;
    }       public String getComposicao(){
            return this.HD_E_Composicao;
    }

    public void setValor(double HD_E_Valor){
    this.HD_E_Valor = HD_E_Valor;
    }       public double getValor(){
            return this.HD_E_Valor;
    }
//metedo construtor
public HD_Encomenda(String HD_E_NC, String HD_E_NR, String HD_E_E, int HD_E_T, String HD_E_C, double HD_E_V){
    this.HD_E_NomeC = HD_E_NC;
    this.HD_E_NomeR = HD_E_NR;
    this.HD_E_Endereco = HD_E_E;
    this.HD_E_Telefone = HD_E_T;
    this.HD_E_Composicao = HD_E_C;
    this.HD_E_Valor = HD_E_V;
                    
}

public void Desconto (double HD_E_V){
    if(HD_E_V > 70){
    HD_E_V = HD_E_V - (HD_E_V*0.1);
    }
        
    }
}


