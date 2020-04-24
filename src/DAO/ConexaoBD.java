/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Henrique
 */
public class ConexaoBD {
    
    private static final String USUARIO = "root";
    private static final String SENHA = "qawsed123";
    private static final String URL_BD = "jdbc:mysql://127.0.0.1:3306/farmacia?useTimezone=true&serverTimezone=UTC";
    
    public static Connection retornaConexao() throws Exception{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conexao = DriverManager.getConnection(URL_BD,USUARIO,SENHA);
     return conexao;   
    }catch(Exception e){
        System.out.printf("Erro de Banco de Dados: "+e.toString());
    }
    return null;
    }

    
}
