package br.edu.principal;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        double z, x, y;
		        
		        
		        System.out.print("Digite o tamanho da escada (em metros): ");
		        z = scanner.nextDouble();
		        
		     
		        System.out.print("Digite a altura em que deseja pregar o quadro (em metros): ");
		        x = scanner.nextDouble();
		        
		        
		        if (z <= x) {
		            System.out.println("Erro: O tamanho da escada deve ser maior que a altura desejada.");
		        } else {
		          
		            y = Math.sqrt(z * z - x * x );
		            
		         
		            System.out.printf("A escada deve estar a %.2f metros da parede.%n", y);
		        }
		        
		        
		        scanner.close();
		    }
		

	}
