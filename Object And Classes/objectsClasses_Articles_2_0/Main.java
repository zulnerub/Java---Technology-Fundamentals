import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		List<Articles> articles = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			List<String> input = Arrays
					.stream(sc.nextLine().split(", "))
					.collect(Collectors.toList());
			
			Articles article = new Articles(input.get(0), input.get(1), input.get(2));
			articles.add(article);
			
		}
		
		String command = sc.nextLine();
		
		switch (command) {
		case "title":
			articles
				.stream()
				.sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()))
				.forEach(article -> {
					System.out.println(article.toString());
				});
			break;
		case "content":
			articles
			.stream()
			.sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent()))
			.forEach(article -> {
				System.out.println(article.toString());
			});
			break;
		case "author":
			articles
			.stream()
			.sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
			.forEach(article -> {
				System.out.println(article.toString());
			});
			break;
		}
		
		
	}

}
