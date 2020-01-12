import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class changeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> nums = Arrays
				.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
		
		String input = "";
		
		while (!"end".equals(input = sc.nextLine())) {
			
			String[] data = input.split("\\s+");
			
			String command = data[0];
			
			switch (command.toLowerCase()) {
			case "delete":
				nums = nums
					.stream()
					.filter(e -> !e.equals(data[1]))
					.collect(Collectors.toList());
				
				break;
			case "insert":
				if(Integer.parseInt(data[2]) >= 0 && Integer.parseInt(data[2]) < nums.size()){
					nums.add(Integer.parseInt(data[2]), data[1]);
				}
				
				
				break;
			}
			
			
		}
		
		System.out.println(nums.toString().replaceAll("\\[|,|\\]", ""));
	}

}
