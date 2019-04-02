package exerciciosIfrs_2019_3;

import java.util.Scanner;

/* Fazer um programa Java para receber um número e verificar se está
 * entre 0 e 100. Se estiver na faixa, imprimir: "Você digitou um
 * número entre 0 e 100", Senão estiver na faixa, imprimir:" Você
 * digitou um número fora da faixa entre 0 e 100.
 */

public class exercicio2 {

	public static void main (String []args) {
		Scanner teclado = new Scanner (System.in);
		
		int num;
		
		System.out.println("Escreva um número inteiro:");
		num = teclado.nextInt();
		
			if ((num <= 100) || (num == 0)) {
				System.out.println("Você digitou um número entre 0 e 100!");
			} else {
				System.out.println("Você digitou um número fora da faixa entre 0 e 100.");
			}
		teclado.close();
	}
}
