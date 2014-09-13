package com.senacrs.hello;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("ERRO","Erro numero 1");
        Log.w("Warning", "Cuidado!");
        Log.i("Info", "Roda antes do setContentView");
        setContentView(R.layout.main);
        System.out.println("Efeito do print");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
