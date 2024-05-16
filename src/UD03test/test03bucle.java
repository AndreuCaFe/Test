package UD03test;

import java.util.Scanner;
public class test03bucle {

	public static void main(String[] args) {
				
		int contador = 0;
		
		while (contador < 1) {
			
			System.out.println("Inserta");
			contador++;
		}
		
		// for(indicar variable; condicion; incremento/decremento)
		for (int i = 0; i<2; i++) {
			System.out.println("numero");
		}
		
		
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		
		while (valor == 5) {
			
			System.out.println("Pon otro numero");
			valor = sc.nextInt();
			
		}
		
		
		System.out.println("Sacabao");	
			
	}
}
