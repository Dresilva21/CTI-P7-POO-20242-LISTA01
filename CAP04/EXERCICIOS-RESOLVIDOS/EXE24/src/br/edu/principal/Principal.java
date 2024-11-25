package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double pre, valor_adic = 0, imposto, pre_custo, desconto, novo_pre;
		String refrig = "N";
		String tipo = "A";
		pre = 25.0;
		
		if(refrig == "N") {
			if (tipo == "A") {
				if (pre < 15) {
					valor_adic = 2;
				}
				else {
					valor_adic = 5;
				}
			}
			if (tipo == "L") {
				if (pre < 10) {
					valor_adic = 1.50;
				}
				else {
					valor_adic = 2.50;
				}
			}
			if (tipo == "V") {
				if (pre < 30) {
					valor_adic = 3;
				}
				else {
					valor_adic = 2.5;
				}
			}
		}
		else {
			if (tipo == "A") {
				valor_adic = 8;
			}
			if (tipo == "L") {
				valor_adic = 0;
			}
			if (tipo == "V") {
				valor_adic = 0;
			}
		}
		System.out.println(valor_adic);
		if (pre < 25) {
			imposto = 5.0/100 * pre;
		}
		else {
			imposto = 8.0/100 * pre;
		}
		System.out.println(imposto);
		pre_custo = pre + imposto;
		System.out.println(pre_custo);
		if (tipo != "A" && refrig != "S") {
			desconto = 3.0/100 * pre_custo;
		}
		else {
			desconto = 0;
		}
		System.out.println(desconto);
		novo_pre = pre_custo + valor_adic - desconto;
		System.out.println(novo_pre);
		if (novo_pre <= 50) {
			System.out.println("Barato");
		}
		else if (novo_pre < 100) {
			System.out.println("Normal");
		}
		else {
			System.out.println("Caro");
		}
	}

}