package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int ano_atual, ano_nascimento, idade_atual, idade_2050;
		ano_atual = 2024;
		ano_nascimento = 2008;
		idade_atual = ano_atual - ano_nascimento;
		idade_2050 = 2050 - ano_nascimento;
		
		System.out.println(idade_atual);
		System.out.println(idade_2050);

	}

}