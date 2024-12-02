package br.edu.principal;

import java.util.Scanner;

import br.edu.uteis.calculamedia;

public class Principal {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        double nota1, nota2, nota3, m;
	        String letra;

	        System.out.print("Digite a primeira nota: ");
	        nota1 = sc.nextDouble();
	        System.out.print("Digite a segunda nota: ");
	        nota2 = sc.nextDouble();
	        System.out.print("Digite a terceira nota: ");
	        nota3 = sc.nextDouble();

	        do {
	            System.out.print("Digite a letra (A para média aritmética, P para média ponderada): ");
	            letra = sc.next();
	        } while (!letra.equals("A") && !letra.equals("P"));

	        m = calculamedia.calculaMedia(nota1, nota2, nota3, letra);

	        if (letra.equals("A")) {
	            System.out.println("A média aritmética é: " + m);
	        } else {
	            System.out.println("A média ponderada é: " + m);
	        }
	    }
	}
