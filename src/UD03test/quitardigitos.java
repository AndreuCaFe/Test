package UD03test;

import java.util.Scanner;
public class quitardigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int ultimodigito = 0;
		int nDigitos = 0;
		
		while(numero > 0) {
			// forma simplificada  --->    ultimodigito += numero % 10;
			ultimodigito = ultimodigito + numero % 10;
			
			numero = numero/10;
			
			nDigitos++;
			
		}
		
		System.out.println(nDigitos);
		System.out.println(ultimodigito);
		
	}

}
