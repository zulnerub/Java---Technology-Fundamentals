package Exercise_01;
import java.util.Scanner;
public class login {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();	
		
		
		String pass = "";
		int count = 0;
		
		for (int i = username.length() - 1;i >= 0;i--) {
			pass += username.charAt(i);
		}
		
		String input = scanner.nextLine();
		
		while (!input.equals(pass) && count < 3) {
			System.out.printf("Incorrect password. Try again.%n");
			input = scanner.nextLine();
			count++;
		}
		
		if (input.equals(pass)){
			System.out.printf("User %s logged in.", username);
		}else {
			System.out.printf("User %s blocked!", username);
		}
		
	}

}
