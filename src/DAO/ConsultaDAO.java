/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import hd_bean.HD_Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Henrique
 */
public class ConsultaDAO {
    public static ArrayList<HD_Consulta> listar(){
    
    ArrayList<HD_Consulta> co = new ArrayList<>();
    
    String sql = "SELECT * FROM consulta";
    
    try{
     Connection conexao = ConexaoBD.retornaConexao(); 
     PreparedStatement stmt = conexao.prepareStatement(sql);
     
     ResultSet registro = stmt.executeQuery(sql);
     
     while(registro.next()){
         HD_Consulta temporario = new HD_Consulta();
         temporario.setNome(registro.getString("Nome"));
         temporario.setIdade(registro.getInt("Idade"));
         temporario.setPressao(registro.getDouble("Pressao"));
         temporario.setSexo(registro.getString("Sexo"));
         temporario.setPeso(registro.getDouble("Peso"));
         temporario.setAltura(registro.getDouble("Altura"));
         
         co.add(temporario);
     }
     return co;
    }catch(Exception e){
        System.err.println("Erro na Listagem de Consulta"+e.toString());
    }
    
    return null;
}
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
