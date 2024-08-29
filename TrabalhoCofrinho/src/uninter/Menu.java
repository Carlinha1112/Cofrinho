package uninter;

import java.util.Scanner;

public class Menu {
	
	Scanner scanner = new Scanner(System.in);
	Cofrinho cofrinho = new Cofrinho();
	
	public void exibirMenu() {
		System.out.println("COFRINHO - Escolha uma opção:");
		System.out.println("1. Adicionar moeda");
		System.out.println("2. Remover moeda");
		System.out.println("3. Listar moedas");
		System.out.println("4. Calcular total convertido para Real");
		System.out.println("5. Sair");
		int opcao = scanner.nextInt();
		
		//Adicionar moeda
		if (opcao == 1) {
			System.out.println("Escolha a moeda: ");
			System.out.println("1. Real");
			System.out.println("2. Dolar");
			System.out.println("3. Euro");
			int opcaoMoeda = scanner.nextInt();
			System.out.println("Digite o valor: ");
			double valorMoeda = scanner.nextDouble();
			if (opcaoMoeda == 1) {
				cofrinho.adicionar(new Real("Real", valorMoeda));
			} else if (opcaoMoeda == 2) {
				cofrinho.adicionar(new Dolar("Dolar", valorMoeda));
			} else if (opcaoMoeda == 3) {
				cofrinho.adicionar(new Euro("Euro", valorMoeda));
			} else {
				System.out.println("Opção inválida.");
				exibirMenu();
			}
				System.out.println("Você escolheu a opção " + opcaoMoeda + " no valor de " + valorMoeda + ".");
			exibirMenu();
			
			//Remover moeda
		} else if (opcao == 2) {
			System.out.println("Escola a moeda a ser removida: ");
			System.out.println("1. Real");
			System.out.println("2. Dolar");
			System.out.println("3. Euro");
			int opcaoMoedaRemovida = scanner.nextInt();
			System.out.println("Digite o valor: ");
			double valorMoedaRemovida = scanner.nextDouble();
			if (opcaoMoedaRemovida == 1) {
				cofrinho.remover(new Real("Real", valorMoedaRemovida));
			} else if (opcaoMoedaRemovida == 2) {
				cofrinho.remover(new Dolar("Dolar", valorMoedaRemovida));
			} else if (opcaoMoedaRemovida == 3) {
				cofrinho.remover(new Euro("Euro", valorMoedaRemovida));
			}
		exibirMenu();
		
		//Listar moedas
		} else if (opcao == 3) {
			cofrinho.listarMoedas(null);
			exibirMenu();
			
		//Calcular total em Real
		} else if (opcao == 4) {
			double totalConvertido = cofrinho.calcularTotal();
			System.out.println("O valor total convertido em Real é " + totalConvertido);
			exibirMenu();
			
		//Sair do programa
		} else if (opcao == 5) {
			System.out.println("Programa encerrado.");
		
		//Opção inválida	
		} else {
			System.out.println("Opção inválida.");
			exibirMenu();
		}
	}	
}
