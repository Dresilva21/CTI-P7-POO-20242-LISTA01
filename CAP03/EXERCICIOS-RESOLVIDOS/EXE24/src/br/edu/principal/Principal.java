package br.edu.principal;

import java.util.Scanner;





public class Principal {

	public static void main(String[] args) 
	{
     
	Scanner sc = new Scanner(System.in);
		        
    double hora, h, m, conversao;
		        
    System.out.print("Digite a hora (formato decimal): ");
	hora = sc.nextDouble();
		        
	 h = Math.floor(hora); 
	 m = (hora - h); 
		        
     conversao = (h * 60) + (m * 100); 
		        
     System.out.print("A conversão total em minutos é: " + (int) conversao);
		               
		}


	}