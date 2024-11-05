package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, r2, r3;
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		quad = Math.pow(num,2);
		cubo = Math.pow(num,3);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		
		System.out.println("O resultado da potencia é: "+quad);
		System.out.println("O resultado da potencia é: "+cubo);
		System.out.println("A raiz quadrada é: "+r2);
		System.out.println("A raiz cúbica é: "+r3);

	}

}
