/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import hd_bean.HD_Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Henrique
 */
public class ConsultaDAO {
    public void lista(){}
public void atualizar(){}
public void excluir(){}
    public static void adicionar(HD_Consulta co){
     String sql = "INSERT INTO consulta (nome, idade, pressao, sexo, peso, altura) VALUES (?,?,?,?,?,?)";
     Connection conexao = null;
     PreparedStatement stmt = null;
     
     try{
         conexao = ConexaoBD.retornaConexao();
         stmt = conexao.prepareStatement (sql);
         
         stmt.setString(1, co.getNome());
         stmt.setInt(2, co.getIdade());
         stmt.setDouble(3, co.getPressao());
         stmt.setString(4, co.getSexo());
         stmt.setDouble(5, co.getPeso());
         stmt.setDouble(6, co.getAltura());
         stmt.execute();
         System.out.println("Consulta Cadastro com Sucesso!!!!");
     }catch(Exception e){
         System.out.println("ERRO DE CADASTRO"+e.toString());
         
 }   

 }
    
}
