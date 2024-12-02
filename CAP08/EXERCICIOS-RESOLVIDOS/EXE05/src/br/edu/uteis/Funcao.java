package br.edu.uteis;

public class Funcao {

	public static double calculo_reajuste(double PA, double PN) {
		double result;
		
		result = (100 * PN - 100 * PA) / PA;
		return result;
	}
}