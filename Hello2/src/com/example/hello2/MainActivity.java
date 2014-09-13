package com.example.hello2;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener, View.OnLongClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button botaoDisparar = (Button) this.findViewById(R.id.buttonDisparar);
        //botaoDisparar.setOnClickListener(this);
        botaoDisparar.setOnLongClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		EditText campoNome = (EditText) findViewById(R.id.campoNome);
		TextView textHello = (TextView) findViewById(R.id.textoHello);
		
		String nome = campoNome.getText().toString();
		Log.i("Nome", nome);
		textHello.setText("Hello "+nome);
		
	}


	@Override
	public boolean onLongClick(View v) {
		EditText campoNome = (EditText) findViewById(R.id.campoNome);
		TextView textHello = (TextView) findViewById(R.id.textoHello);
		
		String nome = campoNome.getText().toString();
		Log.i("Nome", nome);
		textHello.setText("Olá "+nome);
		return false;
	}
    
}
