package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int angulo, voltas;
		angulo = 150;
		
		if (angulo > 360 & angulo < -360) {
			voltas = Math.round(angulo/360);
			angulo = angulo % 360;
		}
		else {
			voltas = 0;
		}
	
		if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
			System.out.println("Está em cima de algum dos eixos");
		}
		if (angulo > 0 && angulo < 90 || angulo < -270 && angulo > -360) {
			System.out.println("1° quadrante");
		}
		if (angulo > 90 && angulo < 180 || angulo < - 180 && angulo > -270) {
			System.out.println("2° quadrante");
		}
		if (angulo > 180 && angulo < 270 || angulo < -90 && angulo > -180) {
			System.out.println("3° quadrante");
		}
		if (angulo > 270 && angulo < 360 || angulo < 0 && angulo > -90) {
			System.out.println("4° quadrante");
		}
		System.out.println(voltas + " " + "volta(s) no sentido");
		if (angulo < 0) {
			System.out.println("horário");
		}
		else {
			System.out.println("anti-horário");
		}
	}

}