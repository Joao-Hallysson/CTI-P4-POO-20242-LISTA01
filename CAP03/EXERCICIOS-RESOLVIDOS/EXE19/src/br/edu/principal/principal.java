package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a_degrau, a_usuario, qtd_degraus;
		
		System.out.println("Digite a altura do degrau: ");
		a_degrau = sc.nextDouble();
		System.out.println("Digite a altura desejada: ");
		a_usuario = sc.nextDouble();
		
		qtd_degraus = (a_usuario * 100 / a_degrau * 100);
		
		System.out.println("Ele deverá subir: "+qtd_degraus);
	}

}
