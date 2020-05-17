/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import hd_bean.HD_Remedio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class RemedioDAO {
    public static ArrayList<HD_Remedio> listar(){
    
    ArrayList<HD_Remedio> re = new ArrayList<>();
    
    String sql = "SELECT * FROM remedio";
    
    try{
     Connection conexao = ConexaoBD.retornaConexao(); 
     PreparedStatement stmt = conexao.prepareStatement(sql);
     
     ResultSet registro = stmt.executeQuery(sql);
     
     while(registro.next()){
         HD_Remedio temporario = new HD_Remedio();
         temporario.setNome(registro.getString("Nome"));
         temporario.setVencimento(registro.getString("Vencimento"));
         temporario.setQuantidade(registro.getInt("Quantidade"));
         temporario.setTipo(registro.getString("Tipo"));
         temporario.setValor(registro.getDouble("Valor"));
         
         re.add(temporario);
     }
     return re;
    }catch(Exception e){
        System.err.println("Erro na Listagem de Remedio"+e.toString());
    }
    
    return null;
}
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
         stmt.setString(2, re.getVencimento());
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
