package exerciciosIfrs_2019_2;

import java.util.Scanner;

/* 
 * Escrever um programa que leia o nome de um vendedor, o seu salário fixo e
o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o
seu nome, o salário fixo e salário no final do mês.
 */

public class exercicio3 {
	
	public static void main (String []args) {
		
		String nome;
		double vendas, salario, total;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escreva seu nome:");
			nome = teclado.nextLine();
			
			
		System.out.println("------------------------------------");
		
		System.out.println("Escreva seu salário FIXO:");
			salario = teclado.nextDouble();
			

		System.out.println("------------------------------------");
			
		System.out.println("Escreva quanto você vendeu este mês:");
			vendas = teclado.nextDouble();
			
			
			teclado.close();
			
			
			total = (vendas*15/100) + salario;
			
		System.out.println("------------------------------------");
			
		System.out.println(nome + ", seu salário fixo + 15% de comissão sobre as vendas deste mês será de:  R$ " + total + "." );
	
		System.out.println("------------------------------------");
		
	}
}
