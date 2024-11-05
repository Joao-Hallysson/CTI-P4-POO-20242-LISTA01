package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, p1, p2, p3, resul;
		
		System.out.println("Digite um número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite um número: ");
		n2 = sc.nextDouble();
		System.out.println("Digite um número: ");
		n3 = sc.nextDouble();
		System.out.println("Digite um número: ");
		p1 = sc.nextDouble();
		System.out.println("Digite um número: ");
		p2 = sc.nextDouble();
		System.out.println("Digite um número: ");
		p3 = sc.nextDouble();
		resul = (n1*p1+ n2*p2+ n3*p3)/(p1+ p2+ p3);
		
		System.out.println("O Resultado da média ponderada: " +resul);


	}

}
