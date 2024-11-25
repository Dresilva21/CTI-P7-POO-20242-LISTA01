package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal_min, nht, coeficiente = 0, sal_bruto, imposto, grat, auxilio, sal_liq;
		String turno = "M";
		String categoria = "O";
		sal_min = 1350;
		nht = 3;
		
		if (turno == "M") {
			coeficiente = 10.0/100 * sal_min;
		}
		if (turno == "V") {
			coeficiente = 15.0/100 * sal_min;
		}
		if (turno == "N") {
			coeficiente = 12.0/100 * sal_min;
		}
		System.out.println(coeficiente);
		sal_bruto = nht * coeficiente;
		System.out.println(sal_bruto);
		
		if(categoria == "O") {
			if (sal_bruto >= 300){
				imposto = 5.0/100 * sal_bruto;
			}
			else {
				imposto = 3.0 / 100 * sal_bruto;
			}
		}
		else {
			if(sal_bruto >= 400) {
				imposto = 6.0/100 * sal_bruto;
			}
			else {
				imposto = 4.0 /100 * sal_bruto;
			}
		}
		System.out.println(imposto);
		if(turno == "N" && nht > 80) {
			grat = 50;
		}
		else {
			grat = 30;
		}
		System.out.println(grat);
		if (categoria == "O" || coeficiente <= 25) {
			auxilio = 1.0/3 * sal_bruto;
		}
		else {
			auxilio = 1.0/2 * sal_bruto;
		}
		System.out.println(auxilio);
		sal_liq = sal_bruto - imposto + grat + auxilio;
		System.out.println(sal_liq);
		if (sal_liq < 350) {
			System.out.println("Mal Remunerado");
		}
		if (sal_liq >= 350 && sal_liq <= 600) {
			System.out.println("Normal");
		}
		if (sal_liq > 600) {
			System.out.println("Bem Remunerado");
		}
	}

}