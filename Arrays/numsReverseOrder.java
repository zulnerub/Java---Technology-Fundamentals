import java.util.Scanner;
public class numsInReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(scanner.nextLine());
			arr[i] = num;
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
	}

}
