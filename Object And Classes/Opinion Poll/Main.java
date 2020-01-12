import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		List<Persons> people = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String[] data = sc.nextLine().split("\\s+");
			
			Persons person = new Persons (data[0], Integer.parseInt(data[1]));
			people.add(person);
		}
		
		people 
			.stream()
			.filter(person -> person.getAge() > 30)
			.sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
			.forEach(e -> {
				System.out.println(e.toString());
			});
		
	}

}
