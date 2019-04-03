package exerciciosIfrs_2019_3;

import java.util.Scanner;

/* Faça um programa Java que leia um dia da semana e
 * retorne o número correspondente! */
 

public class exercicio7 {

		public static void main (String []args) {
			
			Scanner teclado = new Scanner (System.in);
			
			String diaSemana;
			
			System.out.println("Escreva o nome de um dia da semana:");
				diaSemana = teclado.nextLine();
				teclado.close();	
			
					switch (diaSemana){
						
						case "Segunda":System.out.println("2"); break;
						case "Terça":System.out.println("3"); break;
						case "Quarta":System.out.println("4"); break;
						case "Quinta":System.out.println("5"); break;
						case "Sexta":System.out.println("6"); break;
						case "Sábado":System.out.println("7"); break;
						case "Domingo":System.out.println("1"); break;
				
					
				
			}
		}
}
