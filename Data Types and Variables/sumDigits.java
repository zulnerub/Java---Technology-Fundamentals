import java.util.Scanner;
public class sumDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine());
		int add;
		int sum = 0;
		
		while ( num > 0) {
			add = num % 10;
			sum += add;
			num /= 10;
		}
		
		System.out.println(sum);
	}

}
