package com.example.projetocalculadora;

import model.Calculadora;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculadoraActivity extends Activity implements View.OnClickListener{
	Button botaoNumero[], botaoSoma, botaoSubtracao, botaoMultiplicacao, botaoDivisao, botaoIgual;
	EditText textoNumeros;
	Calculadora calc;
	int estado;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        calc = new Calculadora();
        
        estado = 1;
        
        botaoNumero = new Button[10];
                
        botaoNumero[0] = (Button)findViewById(R.id.bot0);
        botaoNumero[1] = (Button)findViewById(R.id.bot1);
        botaoNumero[2] = (Button)findViewById(R.id.bot2);
        botaoNumero[3] = (Button)findViewById(R.id.bot3);
        botaoNumero[4] = (Button)findViewById(R.id.bot4);
        botaoNumero[5] = (Button)findViewById(R.id.bot5);
        botaoNumero[6] = (Button)findViewById(R.id.bot6);
        botaoNumero[7] = (Button)findViewById(R.id.bot7);
        botaoNumero[8] = (Button)findViewById(R.id.bot8);
        botaoNumero[9] = (Button)findViewById(R.id.bot9);
        
        for(int i=0; i<10;i++)
        	botaoNumero[i].setOnClickListener(this);
        
        botaoSoma = (Button)findViewById(R.id.botSoma);
        botaoSoma.setOnClickListener(this);

        botaoSubtracao = (Button)findViewById(R.id.botSubtracao);
        botaoSubtracao.setOnClickListener(this);

        botaoMultiplicacao = (Button)findViewById(R.id.botMultiplicacao);
        botaoMultiplicacao.setOnClickListener(this);

        botaoDivisao = (Button)findViewById(R.id.botDivisao);
        botaoDivisao.setOnClickListener(this);
        
        botaoIgual = (Button)findViewById(R.id.botIgual);
        botaoIgual.setOnClickListener(this);
        
        textoNumeros = (EditText) findViewById(R.id.textoNumeros);
        
    }

    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Teste");
    	getMenuInflater().inflate(R.menu.main, menu);
        
        return true;
    }




	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId()==R.id.menu_settings)
		{
			calc.zerar();
			mostrar(calc.getN1());
		}
		else{
			Log.i("Status do menu",item.getTitle().toString());
		}
		return super.onMenuItemSelected(featureId, item);
	}
    
	public void onClick(View v) {
		if(v.equals(botaoIgual)){
			Log.i("Botao","Igual");
			if(estado == 2)
			{
				calc.calcular();
				mostrar(calc.getResultado());
				estado=3;
			}
			else if(estado==3)
			{
				calc.setN1(calc.getResultado());
				Log.i("3-1",String.valueOf(calc.getN1()));
				Log.i("3-2",String.valueOf(calc.getN2()));
				Log.i("3-3",String.valueOf(calc.getResultado()));
				calc.calcular();
				mostrar(calc.getResultado());
			}
		}
			
		else if(v.equals(botaoSoma) || v.equals(botaoSubtracao) 
				|| v.equals(botaoMultiplicacao) || v.equals(botaoDivisao))
		{
				Log.i("Botao",((Button)v).getText().toString());
				if(estado==2)
				{
					calc.calcular();
					mostrar(calc.getResultado());					
				}
				if(estado==2 || estado==3)
					calc.setN1(calc.getResultado());
				calc.setOperacao(((Button)v).getText().toString());
				calc.setN2(0);
				estado=2;
			
		}
		else {
			for(int i=0; i<10;i++)
				if(v.equals(botaoNumero[i]))
				{
						Log.i("Botao", String.valueOf(i));
						if(estado==1)
						{
							calc.concatenaN1(i);
							mostrar(calc.getN1());
						}
						else if(estado==2)
						{
							calc.concatenaN2(i);
							mostrar(calc.getN2());
						}
						else
						{
							calc.zerar();
							calc.setN1(i);
							mostrar(calc.getN1());
							estado=1;
						}
						System.out.println(estado);
						System.out.println(calc.getN1());
						System.out.println(calc.getN2());
						
				}
		}
			
	}


	public void mostrar(int valor)
	{
		textoNumeros.setText(String.valueOf(valor));
	}




    
}
