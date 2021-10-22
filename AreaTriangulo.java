package fundamentos.atividades;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual altura do tri�ngulo? ");
		String alturaStr = entrada.next().replace(",", ".");
		double alturaDouble = Double.parseDouble(alturaStr);
		
		System.out.print("Qual base do tri�ngulo? ");
		String baseStr = entrada.next().replace(",", ".");
		double baseDouble = Double.parseDouble(baseStr);
		
		double area = (baseDouble * alturaDouble) / (2);
		
		System.out.printf("A area do trin�ngulo � %.2f",area);
		
		entrada.close();
		
	}

}
