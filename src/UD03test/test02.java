package UD03test;

import java.util.Scanner;
public class test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int num1 = sc.nextInt();
		
		switch (num1) {
			case 1:
				//System.out.print("Es primavera");
			case 2:
				System.out.print("Hace calor");
				//System.out.println("Es verano");
				break;
			
			case 3:
				//System.out.println("Es otoño");	
			case 4:
				System.out.println("Hace frio");
				//System.out.println("Es invierno");
				break;
				
			default:
				System.out.println("caca");
		}
		
		
		
				
	}
}


