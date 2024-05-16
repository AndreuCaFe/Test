package EDE;
/**
 * 
 * @author alumne
 */
import java.util.Scanner;
public class U2A2a {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		a=sc.nextInt();
		
		System.out.print("Enter second number: ");
		b=sc.nextInt();
		
		c=addition(a,b);
		System.out.println("Addition of two numbers is: "+c);
		
	}

	private static int addition(int x, int y) {
		
		return x+y;
	}

}
