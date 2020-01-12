import java.util.Scanner;
public class signOfinteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		printSign(input);
	}
	
	static void printSign(String input) {
		if (input.charAt(0) == '0') {
			System.out.printf("The number %s is zero.", input);
		}else if (input.charAt(0) == '-') {
			System.out.printf("The number %s is negative.", input);
		}else {
			System.out.printf("The number %s is positive.", input);
		}
	}

}
