package com.senacrs.projetoradio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity{
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void responderQuestao(View v){
    	RadioGroup radioCurso = (RadioGroup) findViewById(R.id.radioCurso);
    	int option = radioCurso.getCheckedRadioButtonId();
    	
    	if(option == R.id.radioAndroid){
    		Toast.makeText(this, "Sala correta", Toast.LENGTH_SHORT).show();
    	} else {
    		Toast.makeText(this, "Sala errada", Toast.LENGTH_LONG).show();
		}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
