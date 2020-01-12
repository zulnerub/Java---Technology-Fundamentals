import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lessonsExercisesShedule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> schedule = Arrays
				.stream(sc.nextLine().split(", "))
				.collect(Collectors.toList());
		
		String input = "";
		
		while (!"course start".equals(input = sc.nextLine())) {
			String[] data = input.split(":");
			String command = data[0];
			
			switch (command.toLowerCase()) {
			case "add":
				if (!schedule.contains(data[1])) {
					schedule.add(data[1]);
				}
				break;
				
			case "insert":
				if (!schedule.contains(data[1])) {
					schedule.add(Integer.parseInt(data[2]), data[1]);
				}
				break;
				
			case "remove":
				if (schedule.contains(data[1])) {
					schedule.remove(data[1]);
					String exercise = data[1] + "-Exercise";
					if (schedule.contains(exercise)) {
						schedule.remove(exercise);
					}
				}
				break;
				
			case "swap":
				List<String> temp =new ArrayList<>();
				temp.add(data[1]);
				temp.add(data[2]);
				
				List<String> exercises = new ArrayList<>();
				exercises.add(data[1] + "-Exercise");
				exercises.add(data[2] + "-Exercise");
				
				if (schedule.containsAll(temp)) {
					int first = schedule.indexOf(temp.get(0));
					int second = schedule.indexOf(temp.get(1));
					
					schedule.set(first, temp.get(1));
					schedule.set(second, temp.get(0));
					
					if (schedule.contains(exercises.get(0))) {
						schedule.remove(schedule.indexOf(exercises.get(0)));
						schedule.add(schedule.indexOf(temp.get(0)) + 1, exercises.get(0));	
					}
					
					if (schedule.contains(exercises.get(1))) {
						schedule.remove(schedule.indexOf(exercises.get(1)));
						schedule.add(schedule.indexOf(temp.get(1)) + 1, exercises.get(1));	
					}
					
					
				}
				break;
				
			case "exercise":
				if (schedule.contains(data[1])) {
					String exercise = data[1] + "-Exercise";
					if (!schedule.contains(exercise)) {
						schedule.add(schedule.indexOf(data[1]) + 1, exercise);
					}
				}else {
					String exercise = data[1] + "-Exercise";
					schedule.add(data[1]);
					schedule.add(exercise);
				}
				break;
			}
			
		}
		for (String lesson : schedule) {
			System.out.println(schedule.indexOf(lesson) + 1 + "." + lesson);
		}
		
	}

}
