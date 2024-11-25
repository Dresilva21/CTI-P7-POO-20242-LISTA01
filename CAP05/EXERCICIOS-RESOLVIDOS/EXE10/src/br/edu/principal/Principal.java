package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double cont_time, cont_jog, idade, peso, alt, qtde, media_idade = 0;
		double media_altura = 0, porc, tot80;
		
		qtde = 0;
		tot80 = 0;
		
		for(cont_time = 1; cont_time <= 5; cont_time++) {
			media_idade = 0;
			for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
				idade = 24;
				peso = 65;
				alt = 1.80;
				if (idade < 18) {
					qtde = qtde + 1;
					media_idade = media_idade + idade;
					media_altura = media_altura + alt;
				}
				if (peso > 80) {
					tot80 = tot80 + 1;
				}
			}
			media_idade = media_idade / 11;
			System.out.println(media_idade);
		}
		System.out.println(qtde);
		media_altura = media_altura/55;
		System.out.println(media_altura);
		porc = tot80 * 100/55;
		System.out.println(porc);

	}

}