import java.util.Arrays;
import java.util.Scanner;
public class equalSums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] nums = Arrays
				.stream(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		
		for (int i = 0; i < nums.length; i++) {
			int sumLeft = 0;
			int sumRight = 0;
			
			for (int j = 0; j < i; j++) {
				sumLeft += nums[j];
			}
			
			for (int k = i + 1; k < nums.length; k++) {
				sumRight += nums[k];
			}
			
			if (sumLeft == sumRight) {
				System.out.println(i);
				break;
			}else if (i == nums.length - 1){
				System.out.println("no");
			}
		}
		
	}

}
