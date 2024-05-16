package UD03test;

import java.util.Scanner;
public class BuclesYO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nombre = sc.nextInt();
		
		for (int cont = nombre; cont != 0; cont--) {
			
			if (cont > 10) {
				System.out.println("Holaaa");

			} else if (cont < 10) {
				System.out.println("Adioss");
			}
			
		}
		
		
		/**
		 * Tienes que decir hola 
		 */
		
	}
}
