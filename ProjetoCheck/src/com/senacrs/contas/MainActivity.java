package com.senacrs.contas;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener,
		DialogInterface.OnClickListener {

	Button botaoPagar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		botaoPagar = (Button) this.findViewById(R.id.botaoPagar);
		botaoPagar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		CheckBox checkLuz = (CheckBox) findViewById(R.id.checkLuz);
		CheckBox checkAgua = (CheckBox) findViewById(R.id.checkAgua);
		CheckBox checkTelefone = (CheckBox) findViewById(R.id.checkTelefone);
		CheckBox checkCelular = (CheckBox) findViewById(R.id.checkCelular);

		int soma = 0;

		if (checkLuz.isChecked()) {
			soma += Integer.parseInt(checkLuz.getTag().toString());
		}
		if (checkAgua.isChecked()) {
			soma += Integer.parseInt(checkAgua.getTag().toString());
		}
		if (checkTelefone.isChecked()) {
			soma += Integer.parseInt(checkTelefone.getTag().toString());
		}
		if (checkCelular.isChecked()) {
			soma += Integer.parseInt(checkCelular.getTag().toString());
		}

		AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

		dialogo.setTitle("Pagamento");
		dialogo.setMessage("Valor total " + soma);
		dialogo.setNeutralButton("Ok", this);
		dialogo.setNegativeButton("Cancelar", this);
		dialogo.show();
	}

	@Override
	public void onClick(DialogInterface dialog, int tipo) {
		if (tipo == AlertDialog.BUTTON_NEUTRAL) {
			Toast.makeText(getApplicationContext(),
					"Pagamento realizado com sucesso!", Toast.LENGTH_SHORT)
					.show();
		}

		if (tipo == AlertDialog.BUTTON_NEGATIVE) {
			Toast.makeText(getApplicationContext(), "Pagamento cancelado",
					Toast.LENGTH_SHORT).show();

		}

	}

}
