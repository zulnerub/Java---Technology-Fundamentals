import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOpperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> nums = Arrays
				.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
		
		List<String> command = Arrays
				.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
		
		while (!command.get(0).toLowerCase().equals("end")) {
			switch (command.get(0).toLowerCase()) {
			case "add":
				nums.add(command.get(1));
				break;
			case "remove":
				if (Integer.parseInt(command.get(1)) > nums.size() - 1 || Integer.parseInt(command.get(1)) < 0) {
					System.out.println("Invalid index");
				}else {
					nums.remove(Integer.parseInt(command.get(1)));
				}
				break;
			case "insert":
				if (Integer.parseInt(command.get(2)) >= 0 && Integer.parseInt(command.get(2)) < nums.size() ) {
					nums.add(Integer.parseInt(command.get(2)),command.get(1));
				}else {
                  	System.out.println("Invalid index");
				}
				break;
			case "shift":
                int count = Integer.parseInt(command.get(2));
                
                if (nums.size() > 0){
					if (command.get(1).toLowerCase().equals("left")) {
                    	for (int i = 0; i < count % nums.size(); i++){
                    		nums.add(nums.get(0));
                            nums.remove(0);
                        }
                                     
               		}else {
						for (int i = 0; i < count % nums.size(); i++){
                    		nums.add(0, nums.get(nums.size() - 1));
                            nums.remove(nums.size() - 1);
                        }
				
					
				}
                }
				break;
			}
			
			command = Arrays
					.stream(sc.nextLine().split(" "))
					.collect(Collectors.toList());
		}
		
		System.out.println(nums.toString().replaceAll("\\[|,|\\]", ""));
	}

}
