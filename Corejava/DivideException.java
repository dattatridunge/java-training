import java.util.Scanner;

public class DivideException {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
		System.out.println("Enter num1");
		int num1=scan.nextInt();
		System.out.println("Enter num2");
		int num2=scan.nextInt();
		int c=num1/num2;
		System.out.println(c);
		}
		catch(ArithmeticException ex) {
			System.out.println("Cannot divide by zero");
		}

	}

}
