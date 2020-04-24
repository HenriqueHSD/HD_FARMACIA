/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import hd_bean.HD_Remedio;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Henrique
 */
public class RemedioDAO {
    public void lista(){}
public void atualizar(){}
public void excluir(){}
    public static void adicionar(HD_Remedio re){
     String sql = "INSERT INTO remedio (nome, vencimento, quantidade, tipo, valor) VALUES (?,?,?,?,?)";
     Connection conexao = null;
     PreparedStatement stmt = null;
     
     try{
         conexao = ConexaoBD.retornaConexao();
         stmt = conexao.prepareStatement (sql);
         
         stmt.setString(1, re.getNome());
         stmt.setInt(2, re.getVencimento());
         stmt.setInt(3, re.getQuantidade());
         stmt.setString(4, re.getTipo());
         stmt.setDouble(5, re.getValor());
         stmt.execute();
         System.out.println("Remedio Cadastro com Sucesso!!!!");
     }catch(Exception e){
         System.out.println("ERRO DE CADASTRO"+e.toString());
         
 }   

 }
    
}
