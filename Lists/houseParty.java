import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class partyListPeople {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> guestList = new ArrayList<>();
		
		int n = Integer.parseInt(sc.nextLine());
		
		
		for (int i = 0; i < n; i++) {
			List<String> command = Arrays
					.stream(sc.nextLine().split(" "))
					.collect(Collectors.toList());

			switch (command.get(2).toLowerCase()) {
			case "not":
				if (guestList.contains(command.get(0))) {
					guestList.remove(command.get(0));
				}else {
					System.out.println(command.get(0) + " is not in the list!");
				}
				break;
			case "going!":
				if (guestList.contains(command.get(0))) {
					System.out.println(command.get(0) + " is already in the list!");
				}else {
					guestList.add(command.get(0));
				}
				break;
			}
		}
		
		for (int l = 0; l < guestList.size(); l++) {
			System.out.println(guestList.get(l));
		}
		
	}

}
