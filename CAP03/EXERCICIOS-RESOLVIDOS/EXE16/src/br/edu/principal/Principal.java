package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bru, imp, vlr_sal_liq;
		
		System.out.println("Digite as horas trabalhadas: ");
		horas_t = sc.nextDouble();
		System.out.println("Digite o Salário Minimo: ");
		vlr_sal_min = sc.nextDouble();
		
		vlr_hora_t = (vlr_sal_min / 2);
		vlr_sal_bru = (vlr_hora_t * horas_t);
		imp = (vlr_sal_bru * 3 / 100);
		vlr_sal_liq = (vlr_hora_t - imp);
		
		System.out.println("A hora trabalhada é: "+vlr_hora_t);
		System.out.println("O salário bruto é: "+vlr_sal_bru);
		System.out.println("O imposto equivalnete a 3% é: "+imp);
		System.out.println("O salário é: "+vlr_sal_liq);

	}

}
