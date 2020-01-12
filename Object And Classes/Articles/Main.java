import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> input = Arrays
				.stream(sc.nextLine().split(", "))
				.collect(Collectors.toList());
		
		Article article = new Article(input.get(0), input.get(1), input.get(2));
		
		int n = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < n; i++) {
			String[] command = sc.nextLine().split(": ");
			
			switch (command[0]) {
			
			case "Edit":
				article.edit(command[1]);
				break;
			case "ChangeAuthor":
				article.changeAuthor(command[1]);
				break;
			case "Rename":
				article.rename(command[1]);
				break;
			}
		}
		
		System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
		
		
	}

}
