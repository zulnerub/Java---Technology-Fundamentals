import java.util.Scanner;
public class multyplySumOfEvvenOdds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = Math.abs(Integer.parseInt(scanner.nextLine()));
		String n = Integer.toString(num);
		int counter = n.length();
		
		System.out.println(getMultipleOfEvensAndOdds(num, counter));
		
	}
	
	static int getMultipleOfEvensAndOdds(int num, int counter) {
		int evenSum = getSumOfEvenDigits(num, counter);
		int oddSum = getSumOfOddDigits(num, counter);
		
		return evenSum * oddSum;
	}

	static int getSumOfOddDigits(int num, int counter) {
		int oddSum = 0;
		for (int i = 0; i < counter; i++ ) {
			int n = num % 10;
			if (n % 2 != 0) {
				oddSum += n;
			}
			num /= 10;
		}
			
		return oddSum;
	}

	private static int getSumOfEvenDigits(int num, int counter) {
		int evenSum = 0;
		for (int i = 0; i < counter; i++ ) {
			int n = num % 10;
			if (n % 2 == 0) {
				evenSum += n;
			}
			num /= 10;
		}
			
		return evenSum;
	}
	
	

}
