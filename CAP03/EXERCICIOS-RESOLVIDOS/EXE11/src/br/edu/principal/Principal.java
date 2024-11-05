package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num, quad, cubo, r2 ,r3;
		num = 100;
		quad = Math.pow(num,2);
		cubo = Math.pow(num,3);
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		
		System.out.println("A: "+quad);
		System.out.println("B: "+cubo);
		System.out.println("C: "+r2);
		System.out.println("D: "+r3);
		
	}

}