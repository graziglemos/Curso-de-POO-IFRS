package exerciciosIfrs_2019_3;

import java.util.Scanner;

/*Fa�a um programa Java que imprima todos os n�meros inteiros de 1 a n,
 * sendo n um valor inteiro fornecido pelo usu�rio.
 */

public class exercicio4 {

	public static void main (String[]args) {
		
		int num = 1;
		int res;
		
	Scanner teclado = new Scanner (System.in);
	
		System.out.println("Escreva um n�mero inteiro!");
		 res = teclado.nextInt();
		 teclado.close();
		 
		 while (num < res) {
			 System.out.println(num++);
		 }

	}
}
