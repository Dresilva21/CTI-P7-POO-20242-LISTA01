package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num1 = 2;
		double num2 = 2;
		
		double r1 = Math.pow(num1, num2);
		double r2 = Math.pow(num2, num1);
		
		System.out.println(r1);
		System.out.println(r2);

	}

}