package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Sal, salreceber, grat, imp;
		
		System.out.println("Digite seu salário: ");
		Sal = sc.nextDouble();
		grat = (Sal * 5/100);
		imp = (Sal * 7/100);
		salreceber = (Sal + grat - imp);
		
		System.out.println("O resultado do salário com reajuste foi: " +salreceber);

	}

}
