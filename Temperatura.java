package fundamentos;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a temperatura em fahrenheit? (xx,x)");
		double fahrenheit = entrada.nextDouble();
		
		double f = fahrenheit;
		final double AJUSTE = 32;
		
		final double FATOR = 5.0/9.0;
		
		double c = (f - AJUSTE) * FATOR;
		
		System.out.printf("A temperatura é %.2f ºC", c);
		
		entrada.close();
		
	}

}
