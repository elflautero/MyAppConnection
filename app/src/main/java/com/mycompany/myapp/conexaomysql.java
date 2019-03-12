package com.mycompany.myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexaomysql {

	public Connection conectar (){

		Connection conexao = null;
		
		try {
			Class
			.forName("com.mysql.jdbc.Driver");
			conexao = 
			DriverManager
			.getConnection(
			"jdbc:mysql://br234.hostgator.com.br:3306/somde078_android",
			"somde078_android",
			"12345");

		}catch (Exception e){
			System.out.println("Erro: " + e.getMessage());
			return null;
		}
		return conexao;

	}


public void fecharConexao

		(Connection conexao,
		Statement stm ,
		ResultSet rs){

		try {
			if (conexao != null)
				conexao.close();

			if (stm != null)
				stm.close();

			if (rs != null)
				rs.close();
		}catch(Exception e){
			System.out.println("erro ao fechar");
		}
	}
}
