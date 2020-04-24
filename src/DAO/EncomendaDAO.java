/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import hd_classes.HD_Encomenda;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Henrique
 */
public class EncomendaDAO {
    public static void adicionar(HD_Encomenda en){
     String sql = "INSERT INTO encomenda (nome_cliente, nome_remedio, endereco, telefone, composicao, valor) VALUES (?,?,?,?,?,?)";
     Connection conexao = null;
     PreparedStatement stmt = null;
     
     try{
         conexao = ConexaoBD.retornaConexao();
         stmt = conexao.prepareStatement (sql);
         
         stmt.setString(1, en.getNome());
         stmt.setString(2, en.getNomeR());
         stmt.setString(3, en.getEndereco());
         stmt.setInt(4, en.getTelefone());
         stmt.setString(5, en.getComposicao());
         stmt.setDouble(6, en.getValor());
         stmt.execute();
         System.out.println("Encomenda Cadastra com Sucesso!!!!");
     }catch(Exception e){
         System.out.println("ERRO DE CADASTRO"+e.toString());
         
 }   

 }
    
}
