/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import hd_classes.HD_Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Henrique
 */
public class ClienteDAO {
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
