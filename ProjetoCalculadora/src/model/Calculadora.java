package model;

public class Calculadora {
	private int n1;
	private int n2;
	private int resultado;
	private String operacao;
	
	
	public Calculadora()
	{
		zerar();
	}
	
	public void zerar()
	{
		n1 = 0;
		n2 = 0;
		resultado = 0;
		operacao = ".";
	}
	
	public void concatenaN1(int numero)
	{
		n1 = n1==0 ? numero :(n1*10+numero); 
			
	}

	public void concatenaN2(int numero)
	{
		n2 = n2==0 ? numero :(n2*10+numero); 
	}
	
	
	
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setOperacao(String op)
	{
		operacao = op;
	}
		
	public void calcular()
	{
		if (operacao.equals("+")) resultado = n1+n2; 
		else if(operacao.equals("-")) resultado = n1-n2;
		else if(operacao.equals("*")) resultado = n1*n2;
		else if(operacao.equals("/")) resultado = n1/n2;
		else resultado = 0;
	}
	

}
