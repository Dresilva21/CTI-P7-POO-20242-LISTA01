package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double saco,racao_gato1, racao_gato2, total ;
		
		saco = 10; //kilos
		racao_gato1 = 100; //gramas
		racao_gato2 = 100; //gramas
		
		racao_gato1 = racao_gato1 / 1000;
		racao_gato2 = racao_gato2 / 1000;
		
		
		
		total = saco - 5 *(racao_gato1 + racao_gato2);
		System.out.println("após 5 dias o saco terá: " + total + " kg");
		
		

	}

}
