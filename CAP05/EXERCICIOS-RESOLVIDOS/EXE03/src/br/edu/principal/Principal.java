package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int n, num, fat;
		n = 6;
		for (int i = 1; i <= n; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um número: ");
			num = scanner.nextInt();
			
			fat = 1;
			for (int j = 1; j <= num; j++) {
				fat = fat * j;
			}
			System.out.println(fat);
		}

	}

}