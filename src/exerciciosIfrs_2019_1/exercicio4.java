package exerciciosIfrs_2019_1;

import java.util.Scanner;

public class exercicio4 {

	/*Escreva um programa em Java que, dado o raio de um círculo, calcule sua
área. Calculo: área= PI*(raio²). */
	
	public static void main (String []args) {
			double circun, pi, raio;
			pi = 3.14159;
			
		
		System.out.println("Qual o raio do círculo que você deseja calcular a área:");
			Scanner r = new Scanner (System.in);
			raio = r.nextDouble();
			r.close();
			
			System.out.println("A área do círculo é de: " + (circun= (Math.PI*(raio*raio))) + "!");
	
	}
}
