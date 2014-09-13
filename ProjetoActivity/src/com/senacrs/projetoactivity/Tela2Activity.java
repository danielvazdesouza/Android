package com.senacrs.projetoactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Tela2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela2, menu);
		return true;
	}

}
