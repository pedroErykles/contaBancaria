package br.com.contaBancaria.program;

import java.util.Scanner;

import br.com.contaBancaria.model.ContaCorrente;

public class Application3 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		ContaCorrente b3 = new ContaCorrente("P�mela", "890231", 1000.0);
		int opcao;
		Double sacar, depositar, taxaDeJuros;
		
		System.out.println("Informa��es da conta: " + b3.toString());
		System.out.println("Digite 1 para sacar ou 2 para depositar: ");
		opcao = ent.nextInt();
		
		switch(opcao) {
		case 1: System.out.println("Digite o valor a sacar: ");
		sacar = ent.nextDouble();
		System.out.println("Digite a taxa de juros: ");
		taxaDeJuros = ent.nextDouble();
		b3.sacar(sacar, taxaDeJuros);
		break;
		case 2: System.out.println("Digite o valor a ser depositado: ");
		depositar = ent.nextDouble();
		b3.depositar(depositar);
		break;
		default: System.out.println("Erro! Opera��o inv�lida!");
		break;
		}
		
		System.out.println("Informa��es da conta: " + b3.toString());

	}

}
