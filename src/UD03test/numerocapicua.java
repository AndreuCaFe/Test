package UD03test;

import java.util.Scanner;
public class numerocapicua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int capicua = 0;
		int numeroinicial = numero;
		
		while(numero > 0) {
			
			capicua = capicua*10;
			capicua = capicua +  numero%10;
			
			numero = numero/10;
			
		}
				
		System.out.println("El numero alreves es: "+capicua);
		
		if (numeroinicial == capicua) {
			System.out.println("Es Cap i Cua");
		} else {
			System.out.println("No es Cap i Cua");
		}
		
		
	}
}
