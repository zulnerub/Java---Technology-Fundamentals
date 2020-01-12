
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Members> members = new ArrayList<>();
		
		String input = "";
		while (!"End".equals(input = sc.nextLine())) {
			List<String> data = Arrays
					.stream(input.split("\\s+"))
					.collect(Collectors.toList());
			
			Members member = new Members(data.get(0), Integer.parseInt(data.get(1)), Integer.parseInt(data.get(2)));
			members.add(member);
		}
		
		members
			.stream()
			.sorted((a1, a2) -> Integer.compare(a1.getAge(), a2.getAge()))
			.forEach(e -> {
				System.out.println(e.toString());
			});
	}

}
