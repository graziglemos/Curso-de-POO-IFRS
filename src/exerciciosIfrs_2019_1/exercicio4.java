package exerciciosIfrs_2019_1;

import java.util.Scanner;

public class exercicio4 {

	/*Escreva um programa em Java que, dado o raio de um c�rculo, calcule sua
�rea. Calculo: �rea= PI*(raio�). */
	
	public static void main (String []args) {
			double circun, pi, raio;
			pi = 3.14159;
			
		
		System.out.println("Qual o raio do c�rculo que voc� deseja calcular a �rea:");
			Scanner r = new Scanner (System.in);
			raio = r.nextDouble();
			r.close();
			
			System.out.println("A �rea do c�rculo � de: " + (circun= (Math.PI*(raio*raio))) + "!");
	
	}
}
