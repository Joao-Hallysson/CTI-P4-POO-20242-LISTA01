package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Sal, Novosal;
		
		System.out.println("Digite seu salário: ");
		Sal = sc.nextDouble();
		Novosal = (Sal + Sal * 25/100);
		
		System.out.println("O resultado do salário com reajuste foi: " +Novosal);

	}

}
