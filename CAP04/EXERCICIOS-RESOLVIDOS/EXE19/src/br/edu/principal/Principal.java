package br.edu.principal;



public class Principal {
    public static void main(String[] args) {
        double altura, peso;
        altura = 1.80;
        peso = 75;


        if (altura < 1.20) { 
            if (peso <= 60) {
                System.out.println("A");
            } else if (peso > 60 && peso <= 90) {
                System.out.println("D");
            } else if (peso > 90) {
                System.out.println("G");
            }
        } else if (altura >= 1.20 && altura <= 1.70) { 
            if (peso <= 60) {
                System.out.println("B");
            } else if (peso > 60 && peso <= 90) {
                System.out.println("E");
            } else if (peso > 90) {
                System.out.println("H");
            }
        } else if (altura > 1.70) { 
            if (peso <= 60) {
                System.out.println("C");
            } 
            else if (peso > 60 && peso <= 90) {
                System.out.println("F");
            } 
            else if (peso > 90) {
                System.out.println("I");
            }
        }
    }
}
