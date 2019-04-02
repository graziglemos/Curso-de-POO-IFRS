package exerciciosIfrs_2019_3;

import java.util.Scanner;

/*Faça um programa Java que receba três notas, calcule e mostre a
 * média aritmética entre elas. Caso a media aritmética seja maior
 * ou igual a 6 imprima uma mensagem dizendo que o aluno está aprovado,
 * caso a média seja inferior a 6, imprima uma mensagem dizendo que o
 * aluno está reprovado.
 */

public class exercicio3 {

	public static void main (String []arg) {
		Scanner teclado = new Scanner(System.in);
		
		Double n1, n2, n3, media;
		
		System.out.println("Digite a primeira nota do aluno:");
			n1 = teclado.nextDouble();
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Digite a segunda nota do aluno:");
			n2 = teclado.nextDouble();
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Digite a terceira nota do aluno:");
			n3 = teclado.nextDouble();
			
			teclado.close();
		
		System.out.println("----------------------------------------------");
		
		media = ((n1 + n2 + n3) / 3);
		
			if (media >=6){
				System.out.println("O aluno foi APROVADO!");
			}else {
				System.out.println("O aluno foi REPROVADO!");
			}
		
			System.out.println("----------------------------------------------");
	}
	
}
