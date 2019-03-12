package com.mycompany.myapp;

import android.app.*;
import android.os.*;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.*;

public class MainActivity extends Activity 
{

	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	/*
		AlunosDao aluDao = new AlunosDao();
	
		aluDao.listarAlunos();*/
	
		System.out.println("conectou");
	
	}

}
