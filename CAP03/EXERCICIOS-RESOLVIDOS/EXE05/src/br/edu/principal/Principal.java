package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal = 2000 , perc = 10, aumento, novosal;
		aumento = sal * perc / 100;
		System.out.println("O seu aumento é de :" + aumento);
		novosal = sal + aumento;
		System.out.println("Seu novo sálario é de :" + novosal);
	}

}