package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, r1, r2;
		
		System.out.println("Digite um número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite um número: ");
		num2 = sc.nextDouble();
		r1 = Math.pow(num1,num2);
		r2 = Math.pow(num2,num1);
		
		System.out.println("O resultado é: "+r1);
		System.out.println("O resultado é: "+r2);
	}

}
