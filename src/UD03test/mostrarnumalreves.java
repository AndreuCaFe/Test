package UD03test;

import java.util.Scanner;
public class mostrarnumalreves {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		int ultimodigito = 0;
		int nDigitos = 0;
		
		System.out.print("El numero alreves es: ");
		while(numero > 0) {
			// forma simplificada  --->    ultimodigito += numero % 10;
			ultimodigito =  numero%10;
			
			numero = numero/10;
			
			nDigitos++;
			
			System.out.print(ultimodigito);
		}
		
		System.out.println("\nEl numero de digitos es: "+nDigitos);
		
		
		

	}

}
