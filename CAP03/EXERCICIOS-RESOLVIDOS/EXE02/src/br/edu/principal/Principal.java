package br.edu.principal;

import java.util.Scanner;
public class Principal {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double n1, n2, n3, resul;
			
			System.out.println("Digite um número: ");
			n1 = sc.nextDouble();
			System.out.println("Digite um número: ");
			n2 = sc.nextDouble();
			System.out.println("Digite um número: ");
			n3 = sc.nextDouble();
			resul = (n1 + n2 + n3)/3;
			
			System.out.println("O Resultado da Média foi: " +resul);

	}

}
