package com.mycompany.myapp;

import android.app.*;
import android.os.*;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.*;
import android.widget.*;

public class MainActivity extends Activity 
{

	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


		/*
		try {
		
			AlunoDao aluDao = new AlunoDao();

			List<Aluno> list =
				aluDao.listarAlunos();
	
		} catch (Exception e) {
			Toast.makeText(
				this,
				e.toString(),
				Toast.LENGTH_LONG).show();
		}*/
	
	Aluno a = new Aluno();
	
	a.setNome("Jorge - Flor e Ser");
		
	AlunoDao aDao = new AlunoDao();

	try {
		
	aDao.salvarAluno(a);

	} catch (Exception e) {
		Toast.makeText(
			this,
			e.toString(),
			Toast.LENGTH_LONG).show();
	
	}
	}

}
