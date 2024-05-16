package UD03test;

import java.util.Scanner;
public class test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		// Para poder comparar frases con el if es necesario ".equals()"
		if (word.equals("hola")) {
			System.out.println("hola, que tal");
		} else {
			System.out.println("NO");
		}
		
		
		
		
	}

}
