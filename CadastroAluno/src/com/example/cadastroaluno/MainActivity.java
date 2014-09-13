package com.example.cadastroaluno;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void cadastrarAluno(View v){
    	Intent it = new Intent(this, CadastrarActivity.class);
    	startActivity(it);
    }
    
    public void sobre(View v){
    	Intent it = new Intent(this, SobreActivity.class);
    	startActivity(it);
    }
    
    public void sair(View v){
    	finish();
    }
    
}
