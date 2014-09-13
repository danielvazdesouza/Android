package com.example.cadastroaluno;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class CadastrarActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastrar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastrar, menu);
		return true;
	}
	
	public void salvar(View v){
		EditText matricula = (EditText) findViewById(R.id.fieldMatricula);
		EditText nome = (EditText) findViewById(R.id.fieldNome);
		EditText telefone = (EditText) findViewById(R.id.fieldTelefone);
		EditText email = (EditText) findViewById(R.id.fieldEmail);
	}
	
	public void cancelar(View v){
		finish();
	}

}
