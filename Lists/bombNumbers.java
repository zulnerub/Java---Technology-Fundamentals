import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> nums = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		List<Integer> bombNum = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == bombNum.get(0)) {
				
				if ( i - bombNum.get(1) >= 0) {
					
					if ( i + bombNum.get(1) < nums.size()) {
						
						for (int j = 0; j < (2 * bombNum.get(1)) + 1; j++) {
							nums.remove(i - bombNum.get(1));	
						}
						
					}else {
						
						for (int j = i - bombNum.get(1); j < nums.size(); j++) {
							nums.remove(i - bombNum.get(1));
							j--;
						}
						
					}
				}else {
					
					if ( i + bombNum.get(1) < nums.size()) {
						int index = i + bombNum.get(1);
						for (int j = 0; j <= index; j++) {
							nums.remove(0);
							
						}
					}else {
						for (int j = 0; j < nums.size(); j++) {
							nums.remove(0);
							j--;
						}
					}
				}
				
				i = 0;
			}
		}
		
		int sum = 0;
		for (Integer num : nums) {
			sum += num;
		}
		
		System.out.println(sum);
		
	}

}
