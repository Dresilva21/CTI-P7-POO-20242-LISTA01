package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco, imp = 0, transp = 0, seguro, finalPreco, totalImp = 0;
        int origem;
        String meio_t, carga;

        System.out.print("Digite o preço (ou 0 para encerrar): ");
        preco = sc.nextDouble();

        while (preco > 0) {
            System.out.print("Digite a origem (1, 2 ou 3): ");
            origem = sc.nextInt();
            System.out.print("Digite o meio de transporte (A/T/M): ");
            meio_t = sc.next();
            System.out.print("Carga sensível? (S/N): ");
            carga = sc.next();


            if (preco <= 100) {
                imp = preco * 0.05;
            } 
            else {
                imp = preco * 0.10;
            }

            if (carga.equals("S")) {
                if (origem == 1) {
                    transp = 50;
                } 
                else if (origem == 2) {
                    transp = 21;
                } 
                else if (origem == 3) {
                    transp = 24;
                }
            } 
            else if (carga.equals("N")) {
                if (origem == 1) {
                    transp = 12;
                } 
                else if (origem == 2) {
                    transp = 21;
                } 
                else if (origem == 3) {
                    transp = 60;
                }
            }


            if (origem == 2 || meio_t.equals("A")) {
                seguro = preco / 2;
            } 
            else {
                seguro = 0;
            }


            finalPreco = preco + imp + transp + seguro;
            totalImp += imp;


            System.out.printf("Imposto: "+ imp);
            System.out.printf("Transporte:"+ transp);
            System.out.printf("Seguro:"+ seguro);
            System.out.printf("Preço final:"+ finalPreco);

 
            System.out.print("Digite o preço (ou 0 para encerrar): ");
            preco = sc.nextDouble();
        }


        System.out.printf("Total de impostos acumulados:"+ totalImp);

    }
}
