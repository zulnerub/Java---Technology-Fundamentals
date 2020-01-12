import java.util.Arrays;
import java.util.Scanner;
public class magicSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] nums = Arrays
				.stream(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= n) {
				for (int j = i + 1; j < nums.length; j++) {
					if ((nums[i] + nums[j]) == n) {
						System.out.println(nums[i] + " " + nums[j]);
					}
				}
			}
		}
		
	}

}
