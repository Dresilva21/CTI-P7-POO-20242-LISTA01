package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal_base, imposto, grat, sal_liq, tempo;
		sal_base = 1350.0;
		tempo = 6.0;
		
		if(sal_base < 200.0) {
			imposto = 0;
		}
		else if (sal_base <= 450.0){
			imposto = 3.0/100 * sal_base;
		}
		else if (sal_base < 700.0) {
			imposto = 8.0/100 * sal_base;
		}
		else {
			imposto = 12.0 /100 * sal_base;
		}
		System.out.println(imposto);
		if (sal_base > 500) {
			if (tempo <= 3) {
				grat = 20;
			}
			else {
				grat = 30;
			}	
		}
		else {
			if (tempo <= 30) {
				grat = 23;
			}
			else if (tempo < 6) {
				grat = 35;
			}
			else {
				grat = 33;
			}
		}
		System.out.println(grat);
		sal_liq = sal_base - imposto + grat;
		System.out.println(sal_liq);
		if (sal_liq <= 350.0){
			System.out.println("Classificação A");
		}
		else if(sal_liq < 600) {
			System.out.println("Classificação B");
		}
		else {
			System.out.println("Classificação C");
		}
	}

}