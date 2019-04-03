package exerciciosIfrs_2019_4;

import java.util.Scanner;

/*Faça um programa Java com um vetor de 15 posições. Dado dois
 * valores X e Y digitados pelo usuário (entre 0 e 14), faça a soma
 * dos elementos que estão nas respectivas posições X e Y do vetor e
 * imprima os valores e a soma.
 */

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int [] soma = new int [15];
		int x, y;
		soma [0] = (x=10);
		soma [1] = 0;
		soma [2] = 3;
		soma [3] = (y=7);
		
		System.out.println("Digite um valor para X (entre 0 e 14):");
		 x = scan.nextInt();
		
		System.out.println("Digite um valor para Y (entre 0 e 14):");
		y = scan.nextInt();
		scan.close();
		
		
			System.out.println("A soma dos dois valores é: " + (soma[x]+soma[y]) + " e os respectivos valores de X e Y são " + soma[0] + " e " + soma[3] );	

	}

}
