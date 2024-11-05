package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vlr_sal, qtd_kw, vlr_kw ,vlr_reais, desc, vlr_desc;
		
		System.out.println("Digite o valor do seu salário mínimo: ");
		vlr_sal = sc.nextDouble();
		System.out.println("Digite a quantidade de quilowatts: ");
		qtd_kw = sc.nextDouble();
		vlr_kw  = (vlr_sal / 5);
		vlr_reais  = (vlr_kw * qtd_kw);
		desc = (vlr_reais * 15 / 100);
		vlr_desc = (vlr_reais - desc);
		
		System.out.println("O valor de cada  quilowatt: " +vlr_kw);
		System.out.println("O valor a ser pago pela casa: " +vlr_reais);
		System.out.println("O valor a ser pago com 15% de desconto: " +vlr_desc);

	}

}
