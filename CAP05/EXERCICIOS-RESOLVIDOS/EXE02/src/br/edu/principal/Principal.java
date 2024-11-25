package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double n, e, fat;
		n = 5;
		e = 1;
		for (int i = 1; i <= n; i++) {
			fat = 1;
			for(int j = 1; j <= i; j++) {
				fat = fat * j;
			}
			e = e + 1/fat;
		}
		System.out.println(e);
	}

}