package exerciciosIfrs_2019_3;

import java.util.Scanner;

/* Fazer um programa Java para receber um n�mero e verificar se est�
 * entre 0 e 100. Se estiver na faixa, imprimir: "Voc� digitou um
 * n�mero entre 0 e 100", Sen�o estiver na faixa, imprimir:" Voc�
 * digitou um n�mero fora da faixa entre 0 e 100.
 */

public class exercicio2 {

	public static void main (String []args) {
		Scanner teclado = new Scanner (System.in);
		
		int num;
		
		System.out.println("Escreva um n�mero inteiro:");
		num = teclado.nextInt();
		
			if ((num <= 100) || (num == 0)) {
				System.out.println("Voc� digitou um n�mero entre 0 e 100!");
			} else {
				System.out.println("Voc� digitou um n�mero fora da faixa entre 0 e 100.");
			}
		teclado.close();
	}
}
