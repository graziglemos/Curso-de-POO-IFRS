package exerciciosIfrs_2019_1;

import java.util.Scanner;

/*1. Escreva um programa em Java que exiba a soma, a subtra��o, a
multiplica��o e a divis�o de dois n�meros.*/


// SOMA DE DOIS N�MEROS

public class exercicio1 {
	public static void main (String [] args){
	
		int a, b, soma;
		
	System.out.println("Escreva o primeiro n�mero:");
		Scanner resposta = new Scanner(System.in);
		a = resposta.nextInt();
	
	System.out.println("Escreva o segundo n�mero:");
		Scanner resposta1 = new Scanner(System.in);
		b = resposta.nextInt();
				
		resposta.close();
		resposta1.close();
		
		soma = a + b;
	
	System.out.println("A soma dos dois n�meros �: " + soma + ".");
	
	System.out.println("-----------------------------------------------");
	}
	
	
	/*//SUBTRA��O DE DOIS N�MEROS
	
	public static void Subtracao (){ 
		
		*int a, b, subtracao;
		
	System.out.println("Escreva o primeiro n�mero:");
		Scanner sub = new Scanner(System.in);
		 a = sub.nextInt();

	System.out.println("Escreva o segundo n�mero:");
		Scanner sub1 = new Scanner(System.in);
		 b = sub.nextInt();
			
		 subtracao = a - b;
		 
	System.out.println("O resultado �: " + subtracao + ".");
	sub.close();
	sub1.close();
	
	System.out.println("-----------------------------------------------");
	}
	*/
	
	
	
	/*//DIVIS�O DE DOIS N�MEROS
	
	public static void Subtracao (){ 
		
		*int a, b, divisao;
		
	System.out.println("Escreva o primeiro n�mero:");
		Scanner div = new Scanner(System.in);
		 a = div.nextInt();

	System.out.println("Escreva o segundo n�mero:");
		Scanner div1 = new Scanner(System.in);
		 b = div.nextInt();
			
		 divisao = a / b;
		 
	System.out.println("O resultado �: " + divisao + ".");
	sub.close();
	sub1.close();
	
	System.out.println("-----------------------------------------------");
	}
	*/
	
	}
	
	





