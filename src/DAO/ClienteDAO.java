/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import hd_bean.HD_Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class ClienteDAO {
public static ArrayList<HD_Cliente> listar(){
    
    ArrayList<HD_Cliente> c = new ArrayList<>();
    
    String sql = "SELECT * FROM cliente";
    
    try{
     Connection conexao = ConexaoBD.retornaConexao(); 
     PreparedStatement stmt = conexao.prepareStatement(sql);
     
     ResultSet registro = stmt.executeQuery(sql);
     
     while(registro.next()){
         HD_Cliente temporario = new HD_Cliente();
         temporario.setNome(registro.getString("Nome"));
         temporario.setCPF(registro.getString("CPF"));
         temporario.setTelefone(registro.getInt("Telefone"));
         temporario.setEndereco(registro.getString("Endereco"));
         temporario.setEmail(registro.getString("Email"));
         
         c.add(temporario);
     }
     return c;
    }catch(Exception e){
        System.err.println("Erro na Listagem de Cliente"+e.toString());
    }
    
    return null;
}
public void atualizar(){}
public void excluir(){}
public static void adicionar(HD_Cliente c){
     String sql = "INSERT INTO cliente (nome, cpf, telefone, endereco, email) VALUES (?,?,?,?,?)";
     Connection conexao = null;
     PreparedStatement stmt = null;
     
     try{
         conexao = ConexaoBD.retornaConexao();
         stmt = conexao.prepareStatement (sql);
         
         stmt.setString(1, c.getNome());
         stmt.setString(2, c.getCPF());
         stmt.setInt(3, c.getTelefone());
         stmt.setString(4, c.getEndereco());
         stmt.setString(5, c.getEmail());
         stmt.execute();
         System.out.println("Clinte Cadastro com Sucesso!!!!");
     }catch(Exception e){
         System.out.println("ERRO DE CADASTRO"+e.toString());
         
 }   

 }

    
}
