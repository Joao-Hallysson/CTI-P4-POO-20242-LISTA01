package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso_saco, racao_gato1, racao_gato2, total_final;
		
		System.out.println("Digite o peso do saco de ração: ");
		peso_saco = sc.nextDouble();
		System.out.println("Digite a quantidade de ração diária do gato 1: ");
		racao_gato1 = sc.nextDouble();
		System.out.println("Digite a quantidade de ração diária do gato 2: ");
		racao_gato2 = sc.nextDouble();
		
		racao_gato1 = (racao_gato1 / 1000);
		racao_gato2 = (racao_gato2 / 1000);
		total_final = (peso_saco - 5 * (racao_gato1 + racao_gato2));
		
		System.out.println("O que restará no saco de ração é: "+total_final);

	}

}
