package br.com.contaBancaria.program;

import java.util.Scanner;

import br.com.contaBancaria.model.ContaPoupanca;

public class Application2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		ContaPoupanca b2 = new ContaPoupanca("Joaquim", "78430", 1500.0);
		int opcao;
		Double sacar, depositar, taxaDeJuros;
		
		System.out.println("Informações da conta: " + b2.toString());
		System.out.println("Digite 1 para sacar ou 2 para depositar: ");
		opcao = ent.nextInt();
		
		switch(opcao) {
		case 1: System.out.println("Digite o valor a sacar: ");
		sacar = ent.nextDouble();
		
		b2.sacar(sacar);
		
		break;
		case 2: System.out.println("Digite o valor a ser depositado: ");
		depositar = ent.nextDouble();
		
		System.out.println("Digite a taxa de juros: ");
		taxaDeJuros = ent.nextDouble();
		
		b2.depositar(depositar, taxaDeJuros);
		break;
		default: System.out.println("Erro! Operação inválida!");
		break;
		}
		
		System.out.println("Informações da conta: " + b2.toString());

	}

}
