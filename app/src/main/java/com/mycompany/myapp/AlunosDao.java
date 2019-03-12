package com.mycompany.myapp;
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class AlunosDao
{


	Connection conexao = null;
	Statement stm = null;
	ResultSet rs = null;

	conexaomysql conMySQL;
	
	public List<Alunos> listarAlunos(){
		
		List<Alunos> a = new ArrayList<Alunos>();
	
		try {

			conexao = conMySQL.conectar();

			Statement stm = conexao.createStatement();

			ResultSet rs = stm.executeQuery("SELECT id, nome, FROM Alunos");

			
		
			Alunos aluno;
			
			while (rs.next()) {
			
				aluno = new Alunos();
					aluno.setID(rs.getInt("id"));
					aluno.setNome(rs.getString("nome"));
					a.add(aluno);
			}

		} catch(Exception e){

			System.out.println("erro");
			return null;

		}finally {
			conMySQL.fecharConexao(conexao,stm,rs);
		}
		return a;

 	}
		
}
/*
jdbc:mysql://br234.hostgator.com.br:3306/somde078_srh"
		   
		            somde078_srh
		 
		            12345
*/
