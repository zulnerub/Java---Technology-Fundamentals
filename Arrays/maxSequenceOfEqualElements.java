import java.util.Arrays;
import java.util.Scanner;
public class maxSeqOfEqualNums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] nums = Arrays
				.stream(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		
		int longest = 0;
		int index = 0;
		
		for (int i = nums.length - 1; i >= 0; i--) {
			int counter = 0;
			for (int j = i; j >= 0; j--) {
				if (nums[i] == nums[j]) {
					counter++;
					if (counter >= longest) {
						longest = counter;
						index = j;
					}
				}else {
					break;
				}
			}
		}
		for (int k = 0; k < longest; k++) {
			System.out.print(nums[index] + " ");
		}

	}

}
