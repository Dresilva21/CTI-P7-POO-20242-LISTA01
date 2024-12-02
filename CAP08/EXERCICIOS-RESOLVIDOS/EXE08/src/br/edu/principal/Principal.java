package br.edu.principal;

import java.util.Scanner;
import br.edu.uteis.CalcularDuracao;

public class Principal {
		    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		int hora_i, min_i, hora_f, min_f;


		System.out.print("Digite a hora de início (hora minuto): ");
		hora_i = scanner.nextInt();
		min_i = scanner.nextInt();

		System.out.print("Digite a hora de término (hora minuto): ");
		hora_f = scanner.nextInt();
		min_f = scanner.nextInt();

		int minutos = CalcularDuracao.calcularDuracao(hora_i, min_i, hora_f, min_f);

		 System.out.println("A duração do jogo é: " + minutos + " minutos");
		        
	}


		

}

