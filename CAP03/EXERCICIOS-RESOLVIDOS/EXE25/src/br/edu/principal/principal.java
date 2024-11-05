package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custo, convite, qtd;
		
		System.out.println("Digite o custo do espetáculo: ");
		custo = sc.nextDouble();
		System.out.println("Digite o preço dos convites: ");
		convite = sc.nextDouble();
		qtd  = (custo / convite);
		
		
		System.out.println("Devem ser vendidos : " +qtd);
		
	}

}
