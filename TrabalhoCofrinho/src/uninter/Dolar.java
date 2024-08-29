package uninter;

public class Dolar extends Moeda { //Classe filha de Moeda
	
	public Dolar(String moeda, double valor) {
		this.moeda = moeda;
		this.valor = valor;
	}
	
	// Usado para listar as moedas no cofrinho
	public void info() {
		System.out.println("Dolar - " + valor);
	}
	
	// Usado para converter o valor do Dolar em Real
	public double converter() {
		return this.valor * 5.0;
	}
	
	// Usado na remoção das moedas de Real do cofrinho. 
	// Assim, quando for remover determinada moeda, o sistema não cria uma nova.
	@Override
	public boolean equals(Object object) {
		if (this.getClass()!=object.getClass()) {
			return false;
		}
		Dolar objectDolar = (Dolar) object;
		if (this.valor != objectDolar.valor) {
			return false;
		}
		return true;
	}
}
