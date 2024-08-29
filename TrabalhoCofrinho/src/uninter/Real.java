package uninter;

public class Real extends Moeda{ //Classe filha de Moeda

	public Real(String moeda, double valor) {
		this.moeda = moeda;
		this.valor = valor;
	}
	
	// Usado para listar as moedas no cofrinho
	public void info() {
		System.out.println("Real - " + valor);
	}
	
	// Usado no momento de converter o valor das moedas em Real (no caso das moedas de Real, só retorna o valor).
	public double converter() {
		return this.valor;
	}
	
	// Usado na remoção das moedas de Real do cofrinho. 
	// Assim, quando for remover determinada moeda, o sistema não cria uma nova.
	@Override
	public boolean equals(Object object) {
		if (this.getClass()!=object.getClass()) {
			return false;
		}
		Real objectReal = (Real) object;
		if (this.valor != objectReal.valor) {
			return false;
		}
		return true;
	}
}
