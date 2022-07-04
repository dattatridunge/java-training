import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String login="Ranjitha";
		String pass="Ranji@103";
		for(int i=1;i<=3;i++) {
			System.out.println("enter Login name");
			String login1=scan.nextLine();
			System.out.println("enter password");
			String pass1=scan.nextLine();
			if((login.equals(login1) && pass.equals(pass1))) {
				
			System.out.println("welcome"+ login);
			
			}
			else {
				System.out.println("Wrong creentials");
			}
			}
		 System.out.println("Contactadmin");
		 System.exit(0);
			
		}

	}
