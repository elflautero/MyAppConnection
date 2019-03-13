package com.mycompany.myapp;
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class AlunoDao {

	Connection con = null;
	Statement stm = null;
	ResultSet rs = null;

	Conexao conMySQL;

	public List<Aluno> listarAlunos() throws Exception {

		List<Aluno> a = new ArrayList<Aluno>();

		try {

			con = conMySQL.abrirConexao();

			Statement stm = con.createStatement();

			ResultSet rs = stm.executeQuery("SELECT * FROM Aluno a");

			Aluno aluno;

			while (rs.next()) {

				aluno = new Aluno();
				aluno.setID(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				a.add(aluno);
			}

		} catch(Exception e){

			System.out.println("erro");
			return null;

		}finally {
			//conMySQL.fecharConexao(con,stm,rs);
		}
		return a;

 	}


	public void salvarAluno (Aluno aluno) throws Exception {

		try {

			con = conMySQL.abrirConexao();

			Statement stm = con.createStatement();

			stm.executeUpdate(
				"insert into Aluno (nome) values ('bola')");

		} catch(Exception e){
			System.out.println("erro");
		}finally {
			//conMySQL.fecharConexao(con,stm,rs);
		}

 	}

}
/*
try {  
        Statement stmt = connection.createStatement();  
       
        // Prepare a statement to insert a record  
        String sql = "INSERT INTO my_table (col_string) VALUES('a string')";  
       
        // Execute the insert statement  
        stmt.executeUpdate(sql);  
    } catch (SQLException e) {  
    } 
*/
