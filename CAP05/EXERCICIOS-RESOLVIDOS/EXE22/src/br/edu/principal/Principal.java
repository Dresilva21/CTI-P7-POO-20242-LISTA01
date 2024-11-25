package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, tot = 0, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, cont_m2 = 0, cont_f1 = 0;
        int menor_idade = 0;
        double media_idade, perc;
        String sexo, exp;

        System.out.print("Digite a idade (0 para encerrar): ");
        idade = sc.nextInt();

        while (idade != 0) {
            System.out.print("Digite o sexo (M/F): ");
            sexo = sc.next();
            System.out.print("Possui experiência? (S/N): ");
            exp = sc.next();

            if (sexo == "F" && exp == "S") {
                if (idade < menor_idade) {
                    menor_idade = idade;
                }
                tot = tot+1;
            }


            if (sexo == "M") {
                tot_m = tot_m+1;
            } else if (sexo == "F") {
                tot_f = tot_f+1;
            }

            if (sexo == "F" && idade < 21 && exp == "S") {
                cont_f1 = cont_f1 + 1;
            }
            if (sexo == "M" && idade > 45) {
                cont_m1 = cont_m1 + 1;
            }

            if (sexo == "M" && exp =="S") {
                soma1 += idade;
                cont_m2 = cont_m2 + 1;
            }


            System.out.print("Digite a idade (0 para encerrar): ");
            idade = sc.nextInt();
        }


        System.out.println("Total de mulheres: " + tot_f);


        System.out.println("Total de homens: " + tot_m);


        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência.");
        } 
        else {
            media_idade = (double) soma1 / cont_m2;
            System.out.printf("Média de idade dos homens com experiência:", media_idade);
        }


        if (tot_m == 0) {
            System.out.println("Nenhum homem.");
        } 
        else {
            perc = (double) cont_m1 * 100 / tot_m;
            System.out.printf("Porcentagem de homens com mais de 45 anos: ", perc);
        }


        System.out.println("Mulheres com menos de 21 anos e experiência: " + cont_f1);


        if (tot > 0) {
            System.out.println("Menor idade entre mulheres com experiência: " + menor_idade);
        } 
        else {
            System.out.println("Nenhuma mulher com experiência foi registrada.");
        }
    }
}
