package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang, alt, escada, radiano;
		
		System.out.println("Digite a medida do ângulo: ");
		ang = sc.nextDouble();
		System.out.println("Digite a altura da parede: ");
		alt = sc.nextDouble();
		
		radiano = (ang * 3.14 / 180);
		escada = (alt / Math.sin(radiano));
		
		System.out.println("A medida da escada é: "+escada);

	}

}
