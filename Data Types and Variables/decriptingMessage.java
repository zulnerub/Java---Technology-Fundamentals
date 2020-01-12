import java.util.Scanner;
public class decryptingMessages {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message = "";
		
		int cypher = Integer.parseInt(scanner.nextLine());
		int n = Integer.parseInt(scanner.nextLine());
		
		
		for (int i = 0; i < n; i++) {
			String a = scanner.nextLine();
			char ch = a.charAt(0);
			ch += cypher;
			message += ch;	
		}
		System.out.println(message);
	}
}
