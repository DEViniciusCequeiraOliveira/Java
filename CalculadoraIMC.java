package fundamentos.atividades;

import java.util.Scanner;

public class CalculadoraIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o peso em Kg? ");
		String pesoStr = entrada.next().replace(",", ".");
		double pesoDouble = Double.parseDouble(pesoStr);
		
		System.out.print("Qual o altura em m? ");
		String alturaStr = entrada.next().replace(",", ".");
		double alturaDouble = Double.parseDouble(alturaStr);
		
		double imc = (pesoDouble) / (Math.pow(alturaDouble, 2));
				
		System.out.printf("O seu IMC é %.2f Kg/m²",imc);		
		
		entrada.close();
		
	}

}
