import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulatorAdvanced {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		List<Integer> nums = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		List<String> command = Arrays
				.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
		
		while (!command.get(0).toLowerCase().equals("end")) {
			switch (command.get(0).toLowerCase()) {
			case "contains":
				if (nums.contains(Integer.parseInt(command.get(1)))) {
					System.out.println("Yes");
				}else {
					System.out.println("No such number");
				}
				break;
			case "print":
				if (command.get(1).toLowerCase().equals("even")) {
					
					List<Integer> even = new ArrayList<>();
					
					for (int i = 0; i < nums.size(); i++) {
						if (nums.get(i) % 2 == 0) {
							even.add(nums.get(i));
						}
					}
					
					System.out.println(toPrint(even));	
				}else if (command.get(1).toLowerCase().equals("odd")) {

					List<Integer> odd = new ArrayList<>();
					
					for (int i = 0; i < nums.size(); i++) {
						if (nums.get(i) % 2 != 0) {
							odd.add(nums.get(i));
						}
					}
					
					System.out.println(toPrint(odd));
				}
				break;
			case "get":
				long sum = 0;
				for(Integer num : nums) {
					sum += num;
				}
				System.out.println(sum);
				break;
			case "filter":
				switch (command.get(1)) {
				case "<":
					List<Integer> lessThan = new ArrayList<>();
					
					for (Integer num : nums) {
						if (num < Integer.parseInt(command.get(2))) {
							lessThan.add(num);
						}
					}
					
					System.out.println(toPrint(lessThan));
					
					break;
				case ">":
					List<Integer> biggerThan = new ArrayList<>();
					
					for (Integer num : nums) {
						if (num > Integer.parseInt(command.get(2))) {
							biggerThan.add(num);
						}
					}
					
					System.out.println(toPrint(biggerThan));
										
					break;
				case ">=":
					List<Integer> biggerOrEqualThan = new ArrayList<>();
					
					for (Integer num : nums) {
						if (num >= Integer.parseInt(command.get(2))) {
							biggerOrEqualThan.add(num);
						}
					}
					
					System.out.println(toPrint(biggerOrEqualThan));
					
					break;
				case "<=":
					List<Integer> lessOrEqualThan = new ArrayList<>();
					
					for (Integer num : nums) {
						if (num <= Integer.parseInt(command.get(2))) {
							lessOrEqualThan.add(num);
						}
					}
					
					System.out.println(toPrint(lessOrEqualThan));
					
					break;
				}
				break;
			}
			
			command = Arrays
					.stream(sc.nextLine().split(" "))
					.collect(Collectors.toList());
			
		}	
	}

	 static String toPrint(List<Integer> nums) {
		 String output = "";
		 for(Integer num : nums) {
			 output += num + " ";
		 }	 
		 return output.trim();
	}
}

