package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Funcao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, x;		
		System.out.println("Digite número: ");
		num = sc.nextDouble();
		x = Funcao.ver(num);
		if (x == 1) {
			System.out.println("Número positivo");
		} 
		
		else {
			System.out.println("Número negativo");
		}
		
	}

}