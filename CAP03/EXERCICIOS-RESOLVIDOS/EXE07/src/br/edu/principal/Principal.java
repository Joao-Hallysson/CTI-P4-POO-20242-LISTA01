package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Sal, salreceber, imp;
		
		System.out.println("Digite seu salário: ");
		Sal = sc.nextDouble();
		imp = (Sal * 10/100);
		salreceber = (Sal + 50 - imp);
		
		System.out.println("O resultado do salário com reajuste foi: " +salreceber);


	}

}
