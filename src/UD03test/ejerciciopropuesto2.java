package UD03test;

import java.util.Scanner;
public class ejerciciopropuesto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Hoy que dia es? ");
		String num1 = sc.nextLine();
		
		switch (num1) {
			case "Lunes":
			case "Miercoles":
				System.out.println("Descuento del 10%");
				break;
			case "Martes":
			case "Jueves":
				System.out.println("Descuento del 50%");
				break;
			case "Domingo":
				System.out.println("Descuento del 75%");
				break;
			case "Viernes":
			case "Sabado":
				System.out.println("No hay descuento");
				break;
			default:
				System.out.println("Esto no es un dia de la semana sabandija");	
				
		}

	}
}
