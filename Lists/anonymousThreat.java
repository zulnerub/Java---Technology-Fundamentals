import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class evilVirusCIA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> input = Arrays
				.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
		
		List<String> command = Arrays
				.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
				
		while (!command.get(0).toLowerCase().equals("3:1")) {
			int start = validateIndex(Integer.parseInt(command.get(1)), input.size());
			int end = validateIndex(Integer.parseInt(command.get(2)), input.size());
			
			switch (command.get(0).toLowerCase()) {
			case "merge":
				if (start == end) {
					break;
				}else {
					String merging = String.join("",input.subList(start, end + 1));
					
					input.subList(start, end + 1).clear();
					input.add(start, merging);;
				}
				
				
				break;
				
				
			case "divide":
				int index = Integer.parseInt(command.get(1));
				int partitions = Integer.parseInt(command.get(2));
				
				List<String> result = divideEl(input.get(index), partitions);
				input.remove(index);
				input.addAll(index, result);
				
				
				
				break;
			}
			
			command = Arrays
				.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
			
		}
		
		System.out.println(input.toString().replaceAll("\\[|,|\\]", ""));
		
	}

	private static List<String> divideEl(String element, int partitions) {
		int part = element.length() / partitions;
		
		ArrayList<String> result = new ArrayList<>();
		while (element.length() >= part) {
			result.add(element.substring(0,  part));
			element = element.substring(part);
		}
		if (result.size() == partitions) {
			return result;
		}else {
			String concatTwoEls = result.get(result.size() - 2).concat(result.get(result.size() - 1));
			result.subList(result.size() - 2,  result.size()).clear();
			result.add(concatTwoEls);
			return result;
		}
	}

	private static int validateIndex(int index, int lenght) {
		if ( index < 0) {
			index = 0;
			
		}else if ( index > lenght - 1) {
			index = lenght - 1;
			
		} 
			return index;
		
	}

}
