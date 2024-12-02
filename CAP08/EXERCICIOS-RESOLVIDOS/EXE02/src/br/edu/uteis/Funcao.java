package br.edu.uteis;

public class Funcao {
	public static int somar(int num1, int num2) {
		int i, s;
		s = 0;
		
		for(i = num1 +1; i < num2; i++) {
			s = s + i;
		}
		return s;
	}
}