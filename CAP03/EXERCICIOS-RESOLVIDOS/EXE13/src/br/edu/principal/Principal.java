package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double pes, polegada, jardas, milhas;
		pes = 10;
		polegada = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		
		System.out.println("A: "+polegada);
		System.out.println("B: "+jardas);
		System.out.println("C: "+milhas);
	}

}