package uninter;

public abstract class Moeda { //Classe mãe
	
	//Cada moeda precisa ter o tipo (String moeda) e também o valor (double valor)
	String moeda;
	double valor;
	
	public abstract void info();
	public abstract double converter();
	
}
