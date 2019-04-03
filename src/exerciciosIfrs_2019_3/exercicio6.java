package exerciciosIfrs_2019_3;

//Faça um programa Java calcule e imprima a tabuada. de 1 a 10


public class exercicio6 {
	
	public static void main (String[]args) {

		
		int tabuada, mult, res;

		mult = 1;
		
		
			while (mult <=10) {
				
			tabuada = 1;
			
				while (tabuada <=10) {
					
					res = tabuada * mult;
					
					System.out.println(mult + " X " + tabuada + " = " + res );
					
					++tabuada;
					
					}
				++mult;
			}
	}
}
