package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal_min, nht, ndep, nhet;
		double sal_receber, vh, smes, vdep, vhe, imp = 0;
		double sbruto, sliq, grat = 0;
		
		sal_min = 1450;
		nht = 15;
		nht = 10;
		ndep = 5;
		nhet = 6;
		
		vh = 1/5 * sal_min;
		smes = nht * vh;
		vdep = 32 * ndep;
		vhe = nhet * (vh+(vh * 50/100));
		sbruto = smes + vdep + vhe;
		
		if (sbruto < 200) {
			imp = 0;
		}
		if (sbruto >= 200 && sbruto <= 500) {
			imp = sbruto * 10/100;
		}
		if (sbruto > 500) {
			imp = sbruto * 20/100;
		}
		sliq = sbruto - imp;
		if (sliq <= 350) {
			grat = 100;
		}
		if(sliq > 350) {
			grat = 350;
		}
		sal_receber = sliq + grat;
		System.out.println(sal_receber);
		
		

	}

}