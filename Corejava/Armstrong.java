import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		int r,sum=0;
		
		while(n>0) {
		 r=n%10;
		 n=n/10;
		 sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("Number is Armstrong");
			}
			else {
				System.out.println("Number isnot Armstrong");
		}
		
		}
	}
