package com.example.projetoactivity2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void avancarTela(View v){
		EditText campoNome = (EditText) findViewById(R.id.campoNome);
		EditText campoIdade = (EditText) findViewById(R.id.campoIdade);
		
		String nome1 = campoNome.getText().toString();
		int idade1 = Integer.parseInt(campoIdade.getText().toString());
		
		Intent it = new Intent(this, Tela2Activity.class);
		it.putExtra("nome", nome1);
		it.putExtra("idade",idade1);
		
		startActivity(it);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
