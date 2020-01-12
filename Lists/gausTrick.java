import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumLastFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int initialSize = nums.size() / 2;
        for (int i = 0; i < initialSize; i++) {
            int index = nums.size() - 1;
            int firstNum = nums.get(i);
            int secondNum = nums.get(index);

            nums.set(i, firstNum + secondNum);
            nums.remove(index);
        }

        System.out.println(nums.toString().replaceAll("\\[|,|\\]", ""));
    }
}
