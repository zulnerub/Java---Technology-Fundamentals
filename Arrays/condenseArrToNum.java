import java.util.Arrays;
import java.util.Scanner;
public class condensArrToNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr1 = Arrays
				.stream(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		
		
		while (arr1.length > 1) {
			int[] condensed = new int[arr1.length - 1];
			for (int i = 0; i < arr1.length - 1; i++) {
				condensed[i] = arr1[i] + arr1[i + 1];
			}
			arr1 = condensed;
		}
		
		System.out.println(arr1[0]);
	}

}
