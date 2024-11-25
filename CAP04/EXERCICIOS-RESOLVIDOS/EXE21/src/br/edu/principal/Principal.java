package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int cod_est, cod_carga;
        double peso_toneladas, peso_quilos, pre_carga = 0, imposto = 0, valor_total;


        System.out.println("Digite o código do estado (1 a 5):");
        cod_est = sc.nextInt();

        System.out.println("Digite o peso em toneladas:");
        peso_toneladas = sc.nextDouble();

        System.out.println("Digite o código da carga (10 a 40):");
        cod_carga = sc.nextInt();


        peso_quilos = peso_toneladas * 1000;
        System.out.println("Peso em quilos: " + peso_quilos);


        if (cod_carga >= 10 && cod_carga <= 20) {
            pre_carga = 100 * peso_quilos;
        } 
        else if (cod_carga >= 21 && cod_carga <= 30) {
            pre_carga = 250 * peso_quilos;
        } 
        else if (cod_carga >= 31 && cod_carga <= 40) {
            pre_carga = 340 * peso_quilos;
        } 
        else {
            System.out.println("Código da carga inválido.");
        }

        System.out.println("Preço da carga: " + pre_carga);


        if (cod_est == 1) {
            imposto = 0.35 * pre_carga; 
        } 
        else if (cod_est == 2) {
            imposto = 0.25 * pre_carga; 
        } 
        else if (cod_est == 3) {
            imposto = 0.15 * pre_carga; 
        } 
        else if (cod_est == 4) {
            imposto = 0.05 * pre_carga; 
        } 
        else if (cod_est == 5) {
            imposto = 0; 
        } 
        else {
            System.out.println("Código do estado inválido.");
        }

        System.out.println("Imposto: " + imposto);

        valor_total = pre_carga + imposto;
        System.out.println("Valor total: " + valor_total);
    }
}