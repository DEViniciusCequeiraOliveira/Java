package fundamentos.atividades;

import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o valor de a? ");
		int a = entrada.nextInt();
		
		System.out.print("Qual o valor de b? ");
		int b = entrada.nextInt();
	
		System.out.print("Qual o valor de c? ");
		int c = entrada.nextInt();
		
		double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		
		double raiz1 = (- b + delta) / 2 * a;

		double raiz2 = (- b - delta) / 2 * a;
		
		System.out.printf("As suas raizes são %.2f e %.2f",
				raiz1, raiz2);
		
		entrada.close();
		
		
	}

}
