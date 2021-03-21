package fundamentos;

public class AreaCircuferencia {
	public static void main(String[] args) {
		//O Java fornece dois tipos primitivos para armazenar números de ponto flutuante na memória, o tipo float e double. 
		// para criar varial: tipo, nome, simbolo e valor.
		double raio = 3.4;
		final double PI = 3.41211;
		//	 final não deixa que a variavel receba outro valor
		//  se for constante é bom criar com letra maiuscula		
		 double area =  PI * raio * raio;
		System.out.println(area);
		// depis que eu defini o tipo da variavel eu posso continuar usando ela normalmente
		raio = 10;
		area =  PI * raio * raio;
		System.out.println(area);
		// mini exemplo para concatenar
		System.out.println("Area = " + area + "m2.");
	}	
}
