
import java.util.Scanner;

public class integerOps {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, sum;
			a = Integer.parseInt(scanner.nextLine());
			b = Integer.parseInt(scanner.nextLine());
			c = Integer.parseInt(scanner.nextLine());
			d = Integer.parseInt(scanner.nextLine());

		sum = ((a + b) / c ) * d;
		
		System.out.println(sum);
	}

}
