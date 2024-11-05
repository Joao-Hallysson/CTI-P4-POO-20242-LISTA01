package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X, Y, Z;
		
		System.out.println("Digite o tamanho da escada: ");
		Z = sc.nextDouble();
		System.out.println("Digite a altura desejada: ");
		X = sc.nextDouble();
		
		Y = (Math.pow(Z,2) - Math.pow(X,2));
		Y = (Math.sqrt(Y));
		
		System.out.println("A distância que deverá ficar a escada é: "+Y);
	}

}
