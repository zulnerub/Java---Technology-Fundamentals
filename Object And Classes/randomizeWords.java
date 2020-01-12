import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class randomWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<String> input = Arrays
				.stream(scanner.nextLine().split("\\s+"))
				.collect(Collectors.toList());
		
		Random random = new Random();
		
		while(!input.isEmpty()) {
			int randomIndex = random.nextInt(input.size());
			
			String word = input.get(randomIndex);
			System.out.println(word);
			input.remove(randomIndex);
		}
	}

}
