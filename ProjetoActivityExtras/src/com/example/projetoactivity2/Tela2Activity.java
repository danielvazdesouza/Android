package com.example.projetoactivity2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.TextureView;
import android.widget.TextView;

public class Tela2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela2);
		
		Intent it = getIntent();
		
		String nome = it.getStringExtra("nome");
		int idade = it.getIntExtra("idade", 0);
		
		TextView textoNome = (TextView) findViewById(R.id.textoNome);
		textoNome.setText(nome);
		TextView textoIdade = (TextView) findViewById(R.id.textoIdade);
		textoIdade.setText(String.valueOf(idade));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela2, menu);
		return true;
	}

}
