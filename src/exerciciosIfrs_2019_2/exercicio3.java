package exerciciosIfrs_2019_2;

import java.util.Scanner;

/* 
 * Escrever um programa que leia o nome de um vendedor, o seu sal�rio fixo e
o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este
vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o
seu nome, o sal�rio fixo e sal�rio no final do m�s.
 */

public class exercicio3 {
	
	public static void main (String []args) {
		
		String nome;
		double vendas, salario, total;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escreva seu nome:");
			nome = teclado.nextLine();
			
			
		System.out.println("------------------------------------");
		
		System.out.println("Escreva seu sal�rio FIXO:");
			salario = teclado.nextDouble();
			

		System.out.println("------------------------------------");
			
		System.out.println("Escreva quanto voc� vendeu este m�s:");
			vendas = teclado.nextDouble();
			
			
			teclado.close();
			
			
			total = (vendas*15/100) + salario;
			
		System.out.println("------------------------------------");
			
		System.out.println(nome + ", seu sal�rio fixo + 15% de comiss�o sobre as vendas deste m�s ser� de:  R$ " + total + "." );
	
		System.out.println("------------------------------------");
		
	}
}
