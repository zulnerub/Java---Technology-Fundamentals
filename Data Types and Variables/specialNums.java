import java.util.Scanner;
public class specialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		int sum = 0;
		String a;
		for (int i = 1; i <= Integer.parseInt(input); i++) {
			a = "" + i;
			for (int j = 0; j < a.length(); j++ ) {
				char ch = a.charAt(j);
				int num = Character.getNumericValue(ch);
				sum += num;
			}
			System.out.print(i + " -> ");
			if (sum == 5 || sum == 7 || sum == 11) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
			a = "";
			sum = 0;
		}
	}

}
