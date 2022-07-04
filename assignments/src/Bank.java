package java_Assignment2;

public class Bank {
	
	double savings;
	int current;
	public static void totalCash(double savings, int current) {
	
		double sum = savings+ current;
		System.out.println("Total Cash :"+sum);
	}
	public static void totalCash( int current,double savings) {
		
		double sum = savings+ current;
		System.out.println("Total Cash :"+sum);
	}
	public static void Account(int savings) {
		
		
		System.out.println("Fixed Deposite :"+savings);
	}
   public static void Account(float current) {
		
		
		System.out.println("Cash creadit:"+current);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		totalCash(2000000d,12000);
		Account(50000);
		Account(1222.4f);
		
		

	}

}
