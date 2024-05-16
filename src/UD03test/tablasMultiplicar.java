package UD03test;

import java.util.Scanner;
public class tablasMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		for (int num1 = 0; num1 <= 3 ; num1++) {
			
			for (int num2 = 1; num2 <=9 ; num2++) {
				
				System.out.printf("%d * %d = %d \n",num1, num2, num1*num2);	
			}	
			System.out.println();
		}
		

	}
}
