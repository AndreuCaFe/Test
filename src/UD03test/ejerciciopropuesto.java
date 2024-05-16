package UD03test;

import java.util.Scanner;
public class ejerciciopropuesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Hoy que dia es?(En numero) ");
		int num1 = sc.nextInt();
		
		if (num1 == 1 || num1 == 3) {
			System.out.println("Descuento del 10%");
			
		} else if  (num1 == 2 || num1 == 4) {
			System.out.println("Descuento del 50%");
			
		} else if  (num1 == 7) {
			System.out.println("Descuento del 75%");
			
		} else if (num1 == 5 || num1 == 6) {
			System.out.println("No hay descuento");
			
		} else {
			System.out.println("Esto no es un dia de la semana sabandija");
		}
		
		
	}
}
