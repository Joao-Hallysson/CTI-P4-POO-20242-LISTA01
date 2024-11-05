package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, i, f, a;
		
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		
		i = (int)num;
		f = (num - i);
		a = (int)Math.round(num);
		
		System.out.println("A parte inteira do número é: "+i);
		System.out.println("A parte fracionária do número é: "+f);
		System.out.println("O arrendondamento do número é: "+a);
	}

}
