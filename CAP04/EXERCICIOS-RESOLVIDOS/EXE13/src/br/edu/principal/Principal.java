package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, imp, aum, novo_sal;
		int op;
		
		System.out.println("MENU DE OPÇÕES");
		System.out.println("1- IMPOSTO");
		System.out.println("2- NOVO SALÁRIO");
		System.out.println("3- CLASSIFICAÇÃO");
		System.out.println("Digite a opção desejada: ");
		op = sc.nextInt();
		
		if(op == 1)
		{
			System.out.println("Diga o seu salário");
			sal = sc.nextDouble();
			
			if(sal < 500)
			{
				imp = sal * 5/100;
				System.out.println("Valor do imposto é de: " + imp);
			}
			if(sal >= 500 && sal <= 850)
			{
				imp = sal * 10/100;
				System.out.println("Valor do imposto é de: " + imp);;
			}
			if(sal>850)
			{
				imp = sal * 15/100;
				System.out.println("Valor do imposto é de: " + imp);
			}
		}
		
		
		if(op == 2)
		{
			System.out.println("Diga o seu salário");
			sal = sc.nextDouble();
			
			if(sal>1500)
			{
				aum = 25;
				novo_sal = sal+aum;
				System.out.println("Seu novo salário é: "+ novo_sal);
			}
			if(sal>=750 && sal <=1500)
			{
				aum = 50;
				novo_sal = sal+aum;
				System.out.println("Seu novo salário é: "+ novo_sal);
			}
			if(sal>= 450 && sal< 750)
			{
				aum = 75;
				novo_sal = sal+aum;
				System.out.println("Seu novo salário é: "+ novo_sal);
			}
			if(sal<450)
			{
				aum = 100;
				novo_sal = sal+aum;
				System.out.println("Seu novo salário é: "+ novo_sal);
			}
		}
		
		
		if(op == 3)
		{
			System.out.println("Diga o seu salário");
			sal = sc.nextDouble();
			
			if(sal<= 700) 
			{
				System.out.println("Mal Remunerado");
			}
			if(sal > 700) 
			{
				System.out.println("Bem Remunerado");
			}
		}
		
		if(op <1 || op >3 )
		{
			System.out.println("Opção Inválida");
		}
		
		
	}

}
