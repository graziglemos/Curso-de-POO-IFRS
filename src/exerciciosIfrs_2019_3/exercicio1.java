package exerciciosIfrs_2019_3;

import java.util.Scanner;

/* Elaborar um programa Java que efetue a apresentação do valor da
 * conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
 * deverá solicitar o valor da cotação do dólar e também a quantidade de
 * dólares disponíveis com o usuário.
 */

public class exercicio1 {

		public static void maind (String []args) {
			
			Double vd, cotacao, reais;
			
			Scanner teclado = new Scanner (System.in);
			
			System.out.println("Qual o valor em R$ que você deseja converter para $ (dólar)?");
			reais = teclado.nextDouble();
			
			System.out.println("-------------------------------------------");
			
			System.out.println("Qual a cotação do dólar?");
			cotacao = teclado.nextDouble();
			
			System.out.println("-------------------------------------------");
			
			vd = (reais/cotacao);
			
			System.out.println("Seus R$" + vd + "serão convertidos em $" + vd + " dólares, com a cotação de hoje!" );
			
			teclado.close();
		}
	
}
