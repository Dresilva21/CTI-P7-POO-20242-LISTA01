package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double salario, cheque1, cheque2, cpmf2, saldo, cpmf1;
		salario = 1350;
		cheque1 = 250;
		cheque2 = 350;
		
		cpmf1 = cheque1 * 0.38 / 100;
		cpmf2 = cheque2 * 0.38 / 100;
		
		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.println(saldo);
		
		
		

	}

}