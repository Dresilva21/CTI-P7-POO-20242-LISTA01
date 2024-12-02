package br.edu.principal;
import java.util.Scanner;

import br.edu.uteis.Funcao;

public class Principal {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        int num;

	        
	        do {
	            System.out.print("Digite um número de 1 a 9: ");
	            num = scanner.nextInt();
	        } while (num < 1 || num > 9);

	    
	        Funcao.multi(num);
	    }
}