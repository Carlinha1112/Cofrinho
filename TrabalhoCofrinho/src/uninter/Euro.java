package uninter;

public class Euro extends Moeda{ //Classe filha de Moeda
	
	public Euro(String moeda, double valor) {
		this.moeda = moeda;
		this.valor = valor;
	}
	
	// Usado para listar as moedas no cofrinho
	public void info() {
		System.out.println("Euro - " + valor);
	}
	
	// Usado para converter o valor do Euro em Real
	public double converter() {
		return this.valor * 6.0;
	}
	
	// Usado na remoção das moedas de Euro do cofrinho. 
	// Assim, quando for remover determinada moeda, o sistema não cria uma nova.
	@Override
	public boolean equals(Object object) {
		if (this.getClass()!=object.getClass()) {
			return false;
		}
		Euro objectEuro = (Euro) object;
		if (this.valor != objectEuro.valor) {
			return false;
		}
		return true;
	}
}
