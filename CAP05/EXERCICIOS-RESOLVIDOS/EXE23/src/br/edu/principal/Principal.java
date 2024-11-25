package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal, qtd, tipo, valor_kw, gasto, acresc = 0;
		double total, tot_geral, qtd_cons;
		
		tot_geral = 0;
		qtd_cons = 0;
		sal = 1340;
		qtd = 5;
		
		valor_kw = sal / 8;
		while (qtd != 0) {
			gasto = qtd * valor_kw;
			tipo = 1;
			if (tipo == 1) {
				acresc = gasto * 5/100;
			}
			if (tipo == 2) {
				acresc = gasto * 10/100;
			}
			if (tipo == 3) {
				acresc = gasto * 15/100;
			}
			total = gasto + acresc;
			tot_geral = tot_geral + total;
			if (total >= 500 && total <= 1000) {
				qtd_cons = qtd_cons + 1;
			}
			System.out.println(gasto);
			System.out.println(acresc);
			System.out.println(total);
			
			qtd = 7;
		}
		System.out.println(tot_geral);
		System.out.println(qtd_cons);

	}

}