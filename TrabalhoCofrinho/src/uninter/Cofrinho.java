package uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	//Usado para adicionar uma moeda ao cofrinho
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	//Usado para remover uma moeda do cofrinho
	public void remover(Moeda moeda) {
		if(listaMoedas.contains(moeda)) {
		this.listaMoedas.remove(moeda);
		System.out.println("Moeda removida.");
		} else {
			System.out.println("Esta moeda não está no cofrinho.");
		}
	}
	
	//Usado para listar as moedas que estão no cofrinho
	public void listarMoedas(Moeda moeda) {
		if(this.listaMoedas.isEmpty()) {
			System.out.println("O cofrinho está vazio.");
			return;
		}
		for(Moeda moedas:this.listaMoedas) {
			moedas.info();
		}
	}
	
	//Usado para calcular o valor total das moedas do cofrinho em Real
	public double calcularTotal() {
		double total = 0.0;
		for (Moeda moeda : listaMoedas) {
			total += moeda.converter();
		}
		return total;
	}
}
