import java.util.Arrays;
import java.util.Scanner;
public class zigZagArr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for (int i = 1; i <= n; i++ ) {
			int[] temp = Arrays
					.stream(scanner.nextLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			
			if ( i % 2 != 0) {
				arr1[i - 1] = temp[0];
				arr2[i - 1] = temp[1];
			}else {
				arr1[i - 1] = temp[1];
				arr2[i - 1] = temp[0];
			}
		}
		
		for (int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println();
		for (int num : arr2) {
			System.out.print(num + " ");
		}
	}

}
