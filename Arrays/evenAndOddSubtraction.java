import java.util.Arrays;
import java.util.Scanner;
public class sumEvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] nums = Arrays
				.stream(scanner.nextLine().split(" "))
				.mapToInt(e -> Integer.parseInt(e))
				.toArray();
		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				sumEven += nums[i];
			}else {
				sumOdd += nums[i];
			}
		}
		System.out.println((sumEven - sumOdd));
	}

}
