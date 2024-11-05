package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pes, pole, jrd, mlh;
		
		System.out.println("Digite um número: ");
		pes = sc.nextDouble();
		
		pole = ( pes * 12);
		jrd = (pes/3);
		mlh = (jrd/1760);
		
		System.out.println("O resultado é: "+pole);
		System.out.println("O resultado é: "+jrd);
		System.out.println("O resultado é: "+mlh);
	}

}
