/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import hd_bean.HD_Gerente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class GerenteDAO {
public static ArrayList<HD_Gerente> listar(){
    
    ArrayList<HD_Gerente> ger = new ArrayList<>();
    
    String sql = "SELECT * FROM gerente";
    
    try{
     Connection conexao = ConexaoBD.retornaConexao(); 
     PreparedStatement stmt = conexao.prepareStatement(sql);
     
     ResultSet registro = stmt.executeQuery(sql);
     
     while(registro.next()){
         HD_Gerente temporario = new HD_Gerente();
         temporario.setUsuario(registro.getString("Usuario"));
         temporario.setSenha(registro.getString("Senha"));
         
         ger.add(temporario);
     }
     return ger;
    }catch(Exception e){
        System.err.println("Erro na Listagem de Gerente"+e.toString());
    }
    
    return null;
}
public void atualizar(){}
public void excluir(){}
    public static void adicionar(HD_Gerente ger){
     String sql = "INSERT INTO gerente (usuario, senha) VALUES (?,?)";
     Connection conexao = null;
     PreparedStatement stmt = null;
     
     try{
         conexao = ConexaoBD.retornaConexao();
         stmt = conexao.prepareStatement (sql);
         
         stmt.setString(1, ger.getUsuario());
         stmt.setString(2, ger.getSenha());
         
         stmt.execute();
         System.out.println("Gerente Cadastro com Sucesso!!!!");
     }catch(Exception e){
         System.out.println("ERRO DE CADASTRO"+e.toString());
         
 }   

 }
    
}
