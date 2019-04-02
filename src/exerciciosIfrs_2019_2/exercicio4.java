package exerciciosIfrs_2019_2;

import java.util.Scanner;

public class exercicio4 {
	/* Escrever um programa que leia o nome de um aluno e as notas das três
provas que ele obteve no semestre. No final informar o nome do aluno e a
sua média (aritmética).
*/
	
	public static void main (String []args) {
		
		String aluno;
		Double nota1, nota2, nota3, media;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Qual o nome do aluno?");
		aluno = teclado.nextLine();
		
		System.out.println("------------------------------------");
		
		System.out.println("Informe a primeira nota do aluno: " + aluno + ".");
		nota1 = teclado.nextDouble();
		
		
		System.out.println("------------------------------------");
		
		System.out.println("Informe a segunda nota do aluno: " + aluno + ".");
		nota2 = teclado.nextDouble();
		
		
		System.out.println("------------------------------------");
		
		
		System.out.println("Informe a terceira nota do aluno: " + aluno + ".");
		nota3 = teclado.nextDouble();
		teclado.close();
		
		media = ((nota1 + nota2 + nota3) / 3);
		
		
		System.out.println("------------------------------------");
		
		
		System.out.println("A média do aluno, " + aluno + " é de " + media + ".");
	}

}
