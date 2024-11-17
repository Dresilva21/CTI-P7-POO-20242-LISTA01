package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int dia, mes, ano, hora, min;
		double t, d;
		
		d = 17;
		dia = 17;
		mes = 11;
		ano = 2024;
		System.out.print("Data atual "+dia+"/ "+mes+"/ "+ano+" - ");
		
		if (mes ==1) {
			System.out.print("Janeiro");
		}
		else if (mes ==2) {
			System.out.print("Fervereiro");
		}
		else if (mes ==3) {
			System.out.print("Março");
		}
		else if (mes ==4) {
			System.out.print("abril");
		}
		else if (mes ==5) {
			System.out.print("maio");
		}
		else if (mes ==6) {
			System.out.print("Junho");
		}
		else if (mes ==7) {
			System.out.print("Julho");
		}
		else if (mes ==8) {
			System.out.print("Agosto");
		}
		else if (mes ==9) {
			System.out.print("Setembro");
		}
		else if (mes ==10) {
			System.out.print("Outubro");
		}
		else if (mes ==11) {
			System.out.print("Novembro");
		}
		else if (mes ==12) {
			System.out.print("Dezembro");
		}
		
		t = 07.15;
		hora = 07;
		min = 15;
		System.out.println(" - "+"Hora "+hora+":"+min);

	}

}
