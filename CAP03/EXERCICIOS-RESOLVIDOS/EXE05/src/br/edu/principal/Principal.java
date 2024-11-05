package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Sal, Perc, Aumento, Novosal;
		
		System.out.println("Digite seu salário: ");
		Sal = sc.nextDouble();
		System.out.println("Digite o seu percentual: ");
		Perc = sc.nextDouble();
		Aumento = (Sal * Perc/100);
		Novosal = (Sal + Aumento);
		
		System.out.println("O resultado do salário com reajuste foi: " +Novosal);


	}

}
