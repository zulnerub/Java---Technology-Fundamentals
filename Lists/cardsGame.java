import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardsGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> personOne = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		List<Integer> personTwo = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		while (!personOne.isEmpty() && !personTwo.isEmpty() ) {
			for (int i = 0; i < Math.min(personOne.size(), personTwo.size()); i++) {
				if (personOne.get(i) > personTwo.get(i)) {
					personOne.add(personOne.get(i));
					personOne.add(personTwo.get(i));
					
					personOne.remove(i);
					personTwo.remove(i);
				}else if (personOne.get(i) < personTwo.get(i)) {
					personTwo.add(personTwo.get(i));
					personTwo.add(personOne.get(i));
					
					personOne.remove(i);
					personTwo.remove(i);
				}else if (personOne.get(i).equals(personTwo.get(i))) {
					personOne.remove(i);
					personTwo.remove(i);
				}
				
				i = -1;
			}	
		}
		int sum = 0;
		
		if (personOne.size() > personTwo.size() ) {
			for (Integer card : personOne) {
				sum += card;
			}
			System.out.printf("First player wins! Sum: %d", sum);
		}else {
			for (Integer card : personTwo) {
				sum += card;
			}
			System.out.printf("Second player wins! Sum: %d", sum);
		}
		
	}

}
