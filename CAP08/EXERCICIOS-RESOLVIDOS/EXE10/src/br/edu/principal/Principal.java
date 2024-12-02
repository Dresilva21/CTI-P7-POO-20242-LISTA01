package br.edu.principal;
import br.edu.uteis.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num;
		double s;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite algum número: ");
		num =  sc.nextDouble();
		
		s =  Funcao.sequencia(num);
		System.out.println(s);
	}

}
