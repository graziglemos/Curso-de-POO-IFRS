package exerciciosIfrs_2019_2;

import java.util.Scanner;

public class exercicio1 {

	/* Crie um programa Java que, dado um n�mero digitado via teclado, informe
se o n�mero � par ou �mpar. */
	
	public static void main (String []args) {
		
		int num;
		
		System.out.println("Escreva um n�mero:");
		 Scanner teclado = new Scanner (System.in);
		 num = teclado.nextInt();
		 teclado.close();
		
			if (num % 2 == 0) {
				System.out.println("Seu n�mero � par!");
			} else {
				System.out.println("Seu n�mero � �mpar!");
			}
	}
}

