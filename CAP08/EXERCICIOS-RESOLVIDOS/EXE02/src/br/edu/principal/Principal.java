package br.edu.principal;

import br.edu.uteis.Funcao;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int num1, num2, s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		num2 = sc.nextInt();
		s = Funcao.somar(num1 , num2);
		System.out.println("Soma = " + s);
	}

}
