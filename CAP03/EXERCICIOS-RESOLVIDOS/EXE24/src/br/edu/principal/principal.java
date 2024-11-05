package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h;
		double hora, m, conversao;
		
		System.out.println("Digite as horas: ");
		hora = sc.nextDouble();
		
		h = (int)hora;
		m = (hora - h);
		conversao = (h * 60) + (m * 100);
		
		System.out.println("A hora é: " +conversao);

	}

}
