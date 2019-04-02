package exerciciosIfrs_2019_2;

import java.util.Scanner;

public class exercicio2 {

	
		public static void main (String []args) {
			
			System.out.println("Escreva um número:");
			 int num;
			 Scanner teclado = new Scanner (System.in);
			 num = teclado.nextInt();
			 teclado.close();
			
				if (5 % 2 == 0){
				     System.out.println(num + " é um número primo!");
				}else{
				     System.out.println(num + " NÃO é um número primo!");
				}
		}
}
