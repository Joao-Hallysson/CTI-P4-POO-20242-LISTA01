package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, area;
		
		System.out.println("Digite o valor do Raio: ");
		raio = sc.nextDouble();
		area = (3.1415 * Math.pow(raio, 2));
		
		System.out.println("A área do Circulo é: "+area);


	}

}
