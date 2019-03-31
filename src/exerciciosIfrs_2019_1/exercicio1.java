package exerciciosIfrs_2019_1;

import java.util.Scanner;

/*1. Escreva um programa em Java que exiba a soma, a subtração, a
multiplicação e a divisão de dois números.*/


// SOMA DE DOIS NÚMEROS

public class exercicio1 {
	public static void main (String [] args){
	
		int a, b, soma;
		
	System.out.println("Escreva o primeiro número:");
		Scanner resposta = new Scanner(System.in);
		a = resposta.nextInt();
	
	System.out.println("Escreva o segundo número:");
		Scanner resposta1 = new Scanner(System.in);
		b = resposta.nextInt();
				
		resposta.close();
		resposta1.close();
		
		soma = a + b;
	
	System.out.println("A soma dos dois números é: " + soma + ".");
	
	System.out.println("-----------------------------------------------");
	}
	
	
	/*//SUBTRAÇÃO DE DOIS NÚMEROS
	
	public static void Subtracao (){ 
		
		*int a, b, subtracao;
		
	System.out.println("Escreva o primeiro número:");
		Scanner sub = new Scanner(System.in);
		 a = sub.nextInt();

	System.out.println("Escreva o segundo número:");
		Scanner sub1 = new Scanner(System.in);
		 b = sub.nextInt();
			
		 subtracao = a - b;
		 
	System.out.println("O resultado é: " + subtracao + ".");
	sub.close();
	sub1.close();
	
	System.out.println("-----------------------------------------------");
	}
	*/
	
	
	
	/*//DIVISÃO DE DOIS NÚMEROS
	
	public static void Subtracao (){ 
		
		*int a, b, divisao;
		
	System.out.println("Escreva o primeiro número:");
		Scanner div = new Scanner(System.in);
		 a = div.nextInt();

	System.out.println("Escreva o segundo número:");
		Scanner div1 = new Scanner(System.in);
		 b = div.nextInt();
			
		 divisao = a / b;
		 
	System.out.println("O resultado é: " + divisao + ".");
	sub.close();
	sub1.close();
	
	System.out.println("-----------------------------------------------");
	}
	*/
	
	}
	
	





