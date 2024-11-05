package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal = 2000, salreceber, grat = 5 , imp = 7;
		grat = sal * 5/100;
		imp = sal * 7/100;
		salreceber = sal + grat - imp;
		System.out.println("Seu novo salario a receber é de :" + salreceber);

	}

}
