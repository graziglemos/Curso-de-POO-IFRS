package exerciciosIfrs_2019_3;

import java.util.Scanner;

/*Escreva um programa Java que, dado a idade de uma pessoa,
 * imprima uma mensagem informando se essa pessoa é uma criança
 * (abaixo de 12 anos), adolescente (entre 12 e 17 anos), adulto
 * (entre 18 e 60 anos) ou idoso (maior de 60 anos).
 */

public class exercicio5 {

		public static void main (String[]args) {
			
			int idade;
			
			Scanner teclado = new Scanner (System.in);
			
			System.out.println("Escreva a sua idade:");
			idade = teclado.nextInt();
			teclado.close();
			
				if (idade <12) {
					System.out.println("Você é uma criança!");
					
				} else if ((idade == 12) || (idade <=17)) {
					System.out.println("Você é um adolescente!");
					
				} else if ((idade ==18) || (idade<60)) {
					System.out.println("Você é um adulto!");
					
				}else {
					System.out.println("Você é um idoso!");
				}
			
			
		}
	
		
}
