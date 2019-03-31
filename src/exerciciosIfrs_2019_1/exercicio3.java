package exerciciosIfrs_2019_1;

import java.util.Scanner;

/*Escreva um programa em Java que eleve ao quadrado o valor de uma
variável e exiba o resultado. */

public class exercicio3 {
		
	
	public static void main (String [] args) {
		
		int rs;
		
		
		System.out.println("Escreva um número para saber quanto é sua raiz quadrada:");
		Scanner teclado = new Scanner (System.in);
		rs = teclado.nextInt();
		teclado.close();
		
		System.out.println("O número digitado ao quadrado é: " + (rs * rs) + "!");
		
	}
	
	
}
