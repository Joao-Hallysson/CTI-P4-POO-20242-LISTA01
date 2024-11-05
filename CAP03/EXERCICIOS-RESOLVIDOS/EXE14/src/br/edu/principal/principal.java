package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double atual, nasc, idade, idade_2050;
		
		System.out.println("Digite o ano atual: ");
		atual = sc.nextDouble();
		System.out.println("Digite seu ano de nascimento: ");
		nasc = sc.nextDouble();
		
		idade = (atual - nasc);
		idade_2050 = (2050 - nasc );
		
		System.out.println("O resultado é: "+idade);
		System.out.println("O resultado é: "+idade_2050);

	}

}
