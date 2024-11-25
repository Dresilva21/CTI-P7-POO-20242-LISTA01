package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double cont, codigo= 0, nht=0, valor=0, sal_min, sal_inicial, aux, sal_final;
		String turno, categoria;  
		
		sal_min = 450;
		Scanner scanner = new Scanner(System.in);
		for(cont = 1; cont <= 10; cont ++) {
			System.out.println("Digite o código: ");
			codigo = scanner.nextInt();
			
			System.out.println("Digite o valor de nht: ");
			nht = scanner.nextInt();
			
			System.out.println("Digite um turno: ");
			turno = scanner.next();
			
			System.out.println("Digite a categoria: ");
			categoria = scanner.next();
			while (turno != "M" && turno != "V" && turno != "N") {
				System.out.println("Digite o turno: ");
				turno = scanner.next();
			}
			while (categoria != "G" && categoria != "O") {
				System.out.println("Digite uma categoria: ");
				categoria = scanner.next();
			}
			if (categoria == "G") {
				if (turno == "N") {
					valor = sal_min * 18.0/100;
				}
				else {
					valor = sal_min * 15.0/100;
				}
			}
			else {
				if (turno == "N") {
					valor = sal_min * 13.0/100;
				}
				else {
					valor = sal_min * 10.0/100;
				}
			}
		}
		sal_inicial = nht * valor;
		if (sal_inicial <= 300) {
			aux = sal_inicial * 20.0/100;
		}
		else if (sal_inicial < 600) {
			aux = sal_inicial * 15.0/100;
		}
		else {
			aux = sal_inicial * 5/100;
		}
		sal_final = sal_inicial + aux;
		System.out.println(codigo);
		System.out.println(valor);
		System.out.println(nht);
		System.out.println(sal_inicial);
		System.out.println(aux);
		System.out.println(sal_final);
	}
}