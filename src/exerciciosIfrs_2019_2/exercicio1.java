package exerciciosIfrs_2019_2;

import java.util.Scanner;

public class exercicio1 {

	/* Crie um programa Java que, dado um número digitado via teclado, informe
se o número é par ou ímpar. */
	
	public static void main (String []args) {
		
		int num;
		
		System.out.println("Escreva um número:");
		 Scanner teclado = new Scanner (System.in);
		 num = teclado.nextInt();
		 teclado.close();
		
			if (num % 2 == 0) {
				System.out.println("Seu número é par!");
			} else {
				System.out.println("Seu número é ímpar!");
			}
	}
}

