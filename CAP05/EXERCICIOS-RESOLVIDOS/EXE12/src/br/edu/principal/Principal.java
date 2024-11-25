package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num_op, num_maior, cont_m, cont_f, tot_pecas, cont, media_m, salario_maior = 0;
		double media_f, salario_op = 0, tot_folha, pecas_op;
		String sexo_op;
		Scanner sc = new Scanner(System.in);
		
		tot_folha = 0;
		tot_pecas = 0;
		media_m = 0;
		media_f = 0;
		cont_m = 0;
		cont_f = 0;
		
		for (cont = 1; cont <= 15; cont ++) {
			System.out.println("Digite o número do" + cont + "Operario");
			num_op = sc.nextDouble();
			
			System.out.println("Digite o sexo do operário (M ou F)");
			sexo_op = sc.next();
			
			System.out.println("Digite o total de peças fabricadas pelo " + cont + "Operário");
			pecas_op = sc.nextDouble();
			
			if (pecas_op <= 30) {
				salario_op = 450;
			}
			if (pecas_op > 30 && pecas_op <= 50) {
				salario_op = 450 + ((pecas_op - 30) * 3 / 100 * 450);
			}
			if (pecas_op > 50) {
				salario_op = 450 + ((pecas_op - 30) * 5 / 100 * 450);
			}
			System.out.println("O operário de número" + num_op + " Recebe salário = "+salario_op);
			tot_folha = tot_folha + salario_op;
			tot_pecas = tot_pecas + pecas_op;
			if (sexo_op == "M") {
				media_m = media_m + pecas_op;
				cont_m = cont_m + 1;
			}
			else {
				media_f = media_f + pecas_op;
				cont_f = cont_f + 1;
			}
			if (cont == 1) {
				salario_maior = salario_op;
				num_maior = num_op;
			}
			else {
				if (salario_op > salario_maior) {
					salario_maior = salario_op;
					num_maior = num_op;
				}
			}
		}

	}

}