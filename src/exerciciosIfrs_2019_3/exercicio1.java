package exerciciosIfrs_2019_3;

import java.util.Scanner;

/* Elaborar um programa Java que efetue a apresenta��o do valor da
 * convers�o em real (R$) de um valor lido em d�lar (US$). O algoritmo
 * dever� solicitar o valor da cota��o do d�lar e tamb�m a quantidade de
 * d�lares dispon�veis com o usu�rio.
 */

public class exercicio1 {

		public static void maind (String []args) {
			
			Double vd, cotacao, reais;
			
			Scanner teclado = new Scanner (System.in);
			
			System.out.println("Qual o valor em R$ que voc� deseja converter para $ (d�lar)?");
			reais = teclado.nextDouble();
			
			System.out.println("-------------------------------------------");
			
			System.out.println("Qual a cota��o do d�lar?");
			cotacao = teclado.nextDouble();
			
			System.out.println("-------------------------------------------");
			
			vd = (reais/cotacao);
			
			System.out.println("Seus R$" + vd + "ser�o convertidos em $" + vd + " d�lares, com a cota��o de hoje!" );
			
			teclado.close();
		}
	
}
