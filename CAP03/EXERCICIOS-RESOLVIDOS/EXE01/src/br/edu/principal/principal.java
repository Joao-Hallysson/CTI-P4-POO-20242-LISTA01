package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero1, numero2, nfinal;
		
		System.out.println("Digite um número: ");
		numero1 = sc.nextDouble();
		System.out.println("Digite outro número: ");
		numero2 = sc.nextDouble();
		nfinal = (numero1 - numero2);
		
		System.out.println("O resultado da subtração foi: " + nfinal);
	}

}
