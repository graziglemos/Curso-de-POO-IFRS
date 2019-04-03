package exerciciosIfrs_2019_4;

import java.util.Scanner;

/*Faça um programa Java com um vetor de 10 posições e preencha o
 * vetor. Dado um valor X digitado pelo usuário, procure o valor no
 * vetor e retorne a posição onde o valor está, ou, caso não seja
 * encontrado, informe “Valor não encontrado”.
 */

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double [] numero = new double [10];
		
		numero [0] = 1;
		numero [1] = 2;
		numero [2] = 3;
		numero [3] = 4;
		numero [4] = 5;
		numero [5] = 6;
		numero [6] = 7;
		numero [7] = 8;
		numero [8] = 9;
		numero [9] = 10;
		
		int resposta;
		
		System.out.println("Escreva um número de 1 à 10");
			resposta = teclado.nextInt();
			teclado.close();
			
			System.out.println("----------------------------------------------------");
			
				switch (resposta) {
					case 1: System.out.println("A posição do número " + resposta + " é a 0!"); break;
					case 2: System.out.println("A posição do número " + resposta + " é a 1!"); break;
					case 3: System.out.println("A posição do número " + resposta + " é a 2!"); break;
					case 4: System.out.println("A posição do número " + resposta + " é a 3!"); break;
					case 5: System.out.println("A posição do número " + resposta + " é a 4!"); break;
					case 6: System.out.println("A posição do número " + resposta + " é a 5!"); break;
					case 7: System.out.println("A posição do número " + resposta + " é a 6!"); break;
					case 8: System.out.println("A posição do número " + resposta + " é a 7!"); break;
					case 9: System.out.println("A posição do número " + resposta + " é a 8!"); break;
					case 10: System.out.println("A posição do número " + resposta + " é a 9!"); break;
					default:System.out.println("Por favor, escolha um número válido!");
				} 
			System.out.println("----------------------------------------------------");
	}

}
