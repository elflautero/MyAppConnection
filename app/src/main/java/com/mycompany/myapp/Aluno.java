package com.mycompany.myapp;
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Aluno {


	int id;
	String nome;

	public int  getID (){

		return id;
	}

	public void setID (int id){ 

		this.id = id;

	}


	public String getNome (){

		return nome;
	}

	public void setNome (String nome){ 

		this.nome = nome;

	}


}
