import java.util.Scanner;
public class refactoringPrimeNums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 2; i <= n; i++) {
			boolean prime = true;
			for (int div = 2; div < i; div++) {
				if (i % div == 0) {
					prime = false;
					break;
				}
			}
			System.out.printf("%d -> %b%n", i, prime);
		}
	}

}
