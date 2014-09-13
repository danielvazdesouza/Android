package com.senacrs.projetobd;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		SQLiteDatabase banco = openOrCreateDatabase("crudAluno.db", MODE_PRIVATE, null);
		
		ContentValues valorAInserir = new ContentValues();
		valorAInserir.put("matricula", "002");
		valorAInserir.put("nome", "Ciclano");
		valorAInserir.put("telefone", "88998877");
		valorAInserir.put("email", "ciclano@gmail.com");
		banco.insert("aluno", null, valorAInserir);
		
		ContentValues valorAInserir2 = new ContentValues();
		valorAInserir.put("matricula", "003");
		valorAInserir.put("nome", "Fulano");
		valorAInserir.put("telefone", "44442233");
		valorAInserir.put("email", "fulano2@gmail.com");
		banco.insert("aluno", null, valorAInserir2);
		
		Cursor cursor = banco.query("aluno", new String[]{"nome","email"}, "nome=?", new String[]{"Fulano"}, null, null, null);
		
		while(cursor.moveToNext()){
			Log.i("Resultado", cursor.getString(cursor.getColumnIndex("email")));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
