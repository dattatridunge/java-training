import java.util.Scanner;

public class ExceptionBank {

	public static void main(String[] args) throws InsufficientBalanceException,IllegalTransactionException
	{
		double balance=8000;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter withdraw amount")	;
		double withdramt=scan.nextDouble();
		 
			if(withdramt>balance || balance==0) {
				try {
				throw new InsufficientBalanceException();
			 }
				catch(InsufficientBalanceException e) {
					System.out.println(e);
				}
			}
			else {
				double remaining =balance-withdramt;
				System.out.println("remaining balance is" +remaining);
			
		}
	
			if(withdramt<0) {
				try {
				throw new IllegalTransactionException();
			}
				catch(IllegalTransactionException e) {
					System.out.println(e);
				}
		
		


			}
	}}
