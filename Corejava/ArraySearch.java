import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner scan=new Scanner(System.in);
		System.out.println("enter key ");
		int key=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
		//	System.out.println(a[i]);
			if(key==a[i]) {
				System.out.println("element found");
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("Not found");
		}
		

	}

}
