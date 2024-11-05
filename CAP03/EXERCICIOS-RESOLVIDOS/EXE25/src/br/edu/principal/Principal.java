package br.edu.principal;



import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	 
		double custo,convite;
		int qtd;

		        Scanner scanner = new Scanner(System.in);
	
		       
		        System.out.print("Digite o custo do espetáculo: ");
		        custo = scanner.nextDouble();
		        
		       
		        System.out.print("Digite o preço do convite: ");
		        convite = scanner.nextDouble();
		       
		        qtd = (int) Math.ceil(custo / convite); 
		        
		        
		        System.out.printf("Quantidade de convites a serem vendidos: %d.%n", qtd);
		        
		        
		        scanner.close();
		    }
		

	}
