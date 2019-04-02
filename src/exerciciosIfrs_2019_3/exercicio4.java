package exerciciosIfrs_2019_3;

import java.util.Scanner;

/*Faça um programa Java que imprima todos os números inteiros de 1 a n,
 * sendo n um valor inteiro fornecido pelo usuário.
 */

public class exercicio4 {

	public static void main (String[]args) {
		
		int num = 1;
		int res;
		
	Scanner teclado = new Scanner (System.in);
	
		System.out.println("Escreva um número inteiro!");
		 res = teclado.nextInt();
		 teclado.close();
		 
		 while (num < res) {
			 System.out.println(num++);
		 }

	}
}
