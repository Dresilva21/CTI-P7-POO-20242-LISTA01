package br.edu.uteis;

public class Funcao {

	public static double sequencia(double n) {
		int a, b;
		double seq, f;
		
		seq = 0;
		for (a = 0; a < n;a++) {
			f = 1;
			for (b = 1; b <= a;b++) {
				f = f * b;
			}
			seq += 1.0 / f;
		}
		return seq;
	}
}
