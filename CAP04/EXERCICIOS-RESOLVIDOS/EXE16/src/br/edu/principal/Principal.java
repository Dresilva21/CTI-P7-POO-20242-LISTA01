package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double pre, venda, novo_pre = 0;
		pre = 36;
		venda = 350;
		
		if (venda < 500 || pre < 30) {
			novo_pre = pre + 10/100 * pre;
		}
		else if(venda >= 500 && venda < 1200 || pre >= 30 && pre < 80) {
			novo_pre = pre + 15/100 * pre;
		}
		else if(venda >= 1200 || pre >= 80) {
			novo_pre = pre - 20/100 * pre;
		}
		System.out.println(novo_pre);

	}

}