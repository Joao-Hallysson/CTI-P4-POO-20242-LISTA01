package br.edu.principal;

import java.util.Scanner;
public class Pincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, result;
		
		System.out.println("Digite um número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite um número: ");
		n2 = sc.nextDouble();
		System.out.println("Digite um número: ");
		n3 = sc.nextDouble();
		System.out.println("Digite um número: ");
		n4 = sc.nextDouble();
		result = (n1 + n2 + n3 + n4);
		
		System.out.println("O Resultado da Soma foi: " +result);
	}

}
