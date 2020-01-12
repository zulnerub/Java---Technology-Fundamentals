
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class largestOfThreeNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	String result = Arrays.stream(sc.nextLine().split(" "))
			.map(Integer::parseInt)
			.sorted(Collections.reverseOrder())
			.limit(3)
			.map(n -> String.valueOf(n))
			.collect(Collectors.joining(" "));
	System.out.println(result);
			
	}

}
