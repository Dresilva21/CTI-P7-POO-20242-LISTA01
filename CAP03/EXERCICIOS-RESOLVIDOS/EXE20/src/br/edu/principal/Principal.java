package br.edu.principal;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
			
		 Scanner scanner = new Scanner(System.in);

	        double ang, alt, escada, radiano;

	        System.out.print("Digite o ângulo em graus: ");
	        ang = scanner.nextDouble();
	        
	        System.out.print("Digite a altura da parede (em metros): ");
	        alt = scanner.nextDouble();

	        radiano = Math.toRadians(ang);

	        escada = alt / Math.sin(radiano);

	        System.out.printf("O comprimento da escada é: %.2f metros%n", escada);

	        scanner.close();

	    }
	

	}
