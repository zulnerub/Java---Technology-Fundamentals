import java.util.Scanner;
public class sumOfChars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		
		for (int i = 0; i < input; i++) {
			String a = scanner.nextLine();
			char ch = a.charAt(0);
			sum += ch;
		}
		System.out.printf("The sum equals: %d", sum);
	}

}
