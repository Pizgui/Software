/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.software.dal;

import java.sql.*;

/**
 *
 * @author Guilherme
 */
public class ModuloConexao {

    //método responsável por estabelecer a conexão com o banco
    public static Connection conector() {
        Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "Jessa_leo30";
        //Estabelencedo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //a linha de baixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }
    }
}
