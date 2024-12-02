package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Funcao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seg;
		System.out.println("Digite o valor em segundos: ");
		seg = sc.nextInt();
		Funcao.transformacao(seg);
	}
}