package br.edu.principal;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		     
		        double num,i, f;
		        long a;
		        
		        System.out.print("Digite um número real: ");
		        num = scanner.nextDouble();
		        
		      
		       i = Math.floor(num); 
		      
		        f = num - i;
		        
		      
		        a = Math.round(num);
		        
		       
		        System.out.printf("Parte inteira: %.0f%n", i);
		        System.out.printf("Parte fracionária: %.2f%n", f);
		        System.out.printf("Número arredondado: %d%n", a);
		        
	
		        scanner.close();
		    }
		
		
		
		

	}