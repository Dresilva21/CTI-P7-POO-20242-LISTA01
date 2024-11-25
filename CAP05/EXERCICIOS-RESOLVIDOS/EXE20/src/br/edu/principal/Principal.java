package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double cod, num_h, sal_b, sal_l = 0, media_m = 0, media_f = 0, cont_m, cont_f;
		String sexo;
		
		cod = 5;
		
		cont_m = 0;
		cont_f = 0;
		while (cod != 99999) {
			sexo = "M";
			num_h = 55;
			sal_b = num_h * 30;
			if (sexo == "M") {
				sal_l = sal_b - (sal_b * 10/100);
				media_m = media_m + sal_l;
				cont_m = cont_m + 1;
			}
			if (sexo == "F") {
				sal_l = sal_b - (sal_b * 5/100);
				media_f = media_f + sal_l;
				cont_f = cont_f + 1;
			}
			System.out.println(cod);
			System.out.println(sal_b);
			System.out.println(sal_l);
			cod = 5;
		}
		if (cont_m == 0) {
			System.out.println("Nenhum professor do sexo masculino");
		}
		else {
			media_m = media_m / cont_m;
			System.out.println(media_m);
		}
		if (cont_f == 0) {
			System.out.println("Nenhum professor do sexo feminino");
		}
		else {
			media_f = media_f / cont_f;
			System.out.println(media_f);
		}
	}
}