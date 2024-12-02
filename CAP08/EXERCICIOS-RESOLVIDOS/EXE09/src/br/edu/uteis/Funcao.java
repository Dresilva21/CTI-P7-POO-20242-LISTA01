package br.edu.uteis;

import java.util.Scanner;

public class Funcao {

	public static void maior_menor() {
		int i, num, maior = 0, menor = 0;
		Scanner sc = new Scanner(System.in);
		
		for (i=0; i<5;i++) {
			System.out.println("Digite o" + " " + i+1 + " " + "Número:");
			num = sc.nextInt();
			if (i == 0) {
				maior = num;
				menor = num;
			}
			else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
		}
		System.out.println("O maior número digitado foi:" + maior);
		System.out.println("O menor número digitado foi:" + menor);
	}
}