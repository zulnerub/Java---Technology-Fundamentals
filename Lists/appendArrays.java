import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class appendArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> common = Arrays
				.stream(sc.nextLine().split("\\|+"))
				.collect(Collectors.toList());
		
		List<String> sorted = new ArrayList<>();
		String all = "";
		for (int i = common.size() - 1; i >= 0; i--) {
			all += common.get(i).trim() + " ";
		}
		sorted = Arrays
				.stream(all.split("\\s+"))
				.collect(Collectors.toList());
		
		System.out.println(sorted.toString().replaceAll("\\[|,|\\]", ""));
	}

}
