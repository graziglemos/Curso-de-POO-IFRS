package exerciciosIfrs_2019_1;

import java.util.Scanner;

/*Escreva um programa em Java que eleve ao quadrado o valor de uma
vari�vel e exiba o resultado. */

public class exercicio3 {
		
	
	public static void main (String [] args) {
		
		int rs;
		
		
		System.out.println("Escreva um n�mero para saber quanto � sua raiz quadrada:");
		Scanner teclado = new Scanner (System.in);
		rs = teclado.nextInt();
		teclado.close();
		
		System.out.println("O n�mero digitado ao quadrado �: " + (rs * rs) + "!");
		
	}
	
	
}
