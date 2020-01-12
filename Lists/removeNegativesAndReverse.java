import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class reverseAndRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> nums = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < nums.size(); i ++) {
			if (nums.get(i) >= 0) {
				numbers.add(nums.get(i));
			}
		}

		Collections.reverse(numbers);
		
		if (!numbers.isEmpty()) {
			System.out.println(toPrint(numbers));
		}else {
			System.out.println("empty");
		}
	}
	
	static String toPrint(List<Integer> numbers) {
		 String output = "";
		 for(Integer number : numbers) {
			 output += number + " ";
		 }	 
		 return output.trim();
	}

}
