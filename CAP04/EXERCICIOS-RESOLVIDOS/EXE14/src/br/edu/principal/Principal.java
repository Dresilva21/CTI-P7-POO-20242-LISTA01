package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
        double sal, novoSal, boni = 0, aux;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário inicial do funcionário: ");
        sal = scanner.nextDouble();

        if (sal <= 500) {
            boni = sal * 5 / 100; 
        } else if (sal <= 1200) {
            boni = sal * 12 / 100; 
        } else {
            boni = 0;
        }

     
        if (sal <= 600) {
            aux = 150;
        } else {
            aux = 100;
        }

     
        novoSal = sal + boni + aux;

     
        System.out.printf("O novo salário do funcionário, com bonificação e auxílio escola, é: R$ %.2f\n", novoSal);

       
        scanner.close();
    }
}