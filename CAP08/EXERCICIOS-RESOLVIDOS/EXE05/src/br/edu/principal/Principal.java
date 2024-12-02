package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.Funcao;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precoantigo, precoatual, acrescimo;
		
		System.out.println("Digite o antigo preço: ");
		precoantigo = sc.nextDouble();
		System.out.println("Digite o novo preço: ");
		precoatual = sc.nextDouble();
		
		acrescimo = Funcao.calculo_reajuste(precoantigo, precoatual);
		System.out.println("O percentual do aumento do novo preço em relação ao antogo é de " +acrescimo + " %");
		
	}
}