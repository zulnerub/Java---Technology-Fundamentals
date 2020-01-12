import java.util.Arrays;
import java.util.Scanner;
public class identicalArrs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr1 = Arrays
				.stream(scanner.nextLine().split(" "))
				.mapToInt(e -> Integer.parseInt(e))
				.toArray();
		int[] arr2 = Arrays
				.stream(scanner.nextLine().split(" "))
				.mapToInt(e -> Integer.parseInt(e))
				.toArray();
		
		int sum = 0;
		boolean identical = true;
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				sum += arr1[i];
			}else {
				System.out.printf("Arrays are not identical. Found difference at %d index.", i);
				identical = false;
				break;
			}
		}
		if (identical) {
			System.out.printf("Arrays are identical. Sum: %d", sum);
		}
	}

}
