package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, soma, i;
		System.out.println("Digite o valor m: ");
		m = sc.nextInt();
		System.out.println("Digite o valor n: ");
		n = sc.nextInt();
		
		while(m<n)
		{
			soma = 0;
			for(i = m; i <n ; i++ )
			{
				soma = soma + i;
			}
			System.out.println("A soma é de: " + soma);
			System.out.println("Digie m (para finalizar m deve ser maior que n): ");
			m = sc.nextInt();
			System.out.println("Digie n (para finalizar m deve ser maior que n): ");
			n = sc.nextInt();
		}
	}
}
