/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import hd_bean.HD_Encomenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class EncomendaDAO {
    public static ArrayList<HD_Encomenda> listar(){
    
    ArrayList<HD_Encomenda> en = new ArrayList<>();
    
    String sql = "SELECT * FROM encomenda";
    
    try{
     Connection conexao = ConexaoBD.retornaConexao(); 
     PreparedStatement stmt = conexao.prepareStatement(sql);
     
     ResultSet registro = stmt.executeQuery(sql);
     
     while(registro.next()){
         HD_Encomenda temporario = new HD_Encomenda();
         temporario.setNome(registro.getString("Nome_cliente"));
         temporario.setNomeR(registro.getString("Nome_remedio"));
         temporario.setEndereco(registro.getString("Endereco"));
         temporario.setTelefone(registro.getInt("Telefone"));
         temporario.setComposicao(registro.getString("Composicao"));
         temporario.setValor(registro.getDouble("Valor"));
         
         en.add(temporario);
     }
     return en;
    }catch(Exception e){
        System.err.println("Erro na Listagem de Encomenda"+e.toString());
    }
    
    return null;
}
public void atualizar(){}
public void excluir(){}
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
