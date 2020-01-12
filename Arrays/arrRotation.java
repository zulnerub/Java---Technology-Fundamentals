import java.util.Arrays;
import java.util.Scanner;
public class rotateArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = Arrays
				.stream(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int r = n % arr.length;
		
		for (int i = 0; i < r; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
	}

}
