import java.util.Scanner;
public class charUpperLowerCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.nextLine();
		char ch = a.charAt(0);
		System.out.println(Character.isUpperCase(ch) ? "upper-case" : "lower-case");
	}

}
