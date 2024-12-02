package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Funcao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, result;
		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();
		while (a<=0) 
		{
			System.out.println("Digite o valor de a (maior ou igual a 1): ");
			a = sc.nextInt();
		}
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		System.out.println("Digite o valor de c: ");
		c = sc.nextInt();
		
		result = Funcao.divisores(a, b, c);
		System.out.println("Soma dos inteiros = "+result);
	}
}