package exerciciosIfrs_2019_4;

import java.util.Scanner;

/*Fa�a um programa Java com um vetor de 10 posi��es e preencha o
 * vetor. Dado um valor X digitado pelo usu�rio, procure o valor no
 * vetor e retorne a posi��o onde o valor est�, ou, caso n�o seja
 * encontrado, informe �Valor n�o encontrado�.
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
		
		System.out.println("Escreva um n�mero de 1 � 10");
			resposta = teclado.nextInt();
			teclado.close();
			
			System.out.println("----------------------------------------------------");
			
				switch (resposta) {
					case 1: System.out.println("A posi��o do n�mero " + resposta + " � a 0!"); break;
					case 2: System.out.println("A posi��o do n�mero " + resposta + " � a 1!"); break;
					case 3: System.out.println("A posi��o do n�mero " + resposta + " � a 2!"); break;
					case 4: System.out.println("A posi��o do n�mero " + resposta + " � a 3!"); break;
					case 5: System.out.println("A posi��o do n�mero " + resposta + " � a 4!"); break;
					case 6: System.out.println("A posi��o do n�mero " + resposta + " � a 5!"); break;
					case 7: System.out.println("A posi��o do n�mero " + resposta + " � a 6!"); break;
					case 8: System.out.println("A posi��o do n�mero " + resposta + " � a 7!"); break;
					case 9: System.out.println("A posi��o do n�mero " + resposta + " � a 8!"); break;
					case 10: System.out.println("A posi��o do n�mero " + resposta + " � a 9!"); break;
					default:System.out.println("Por favor, escolha um n�mero v�lido!");
				} 
			System.out.println("----------------------------------------------------");
	}

}
