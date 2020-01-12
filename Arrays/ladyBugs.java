import java.util.Arrays;
import java.util.Scanner;
 
public class ladyBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int fieldSize = Integer.parseInt(scanner.nextLine());
        if (fieldSize == 0) {
            return;
        }
        int[] fieldPos = new int[fieldSize];
 
        int[] initialIndexes = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
 
        for (int i = 0; i < initialIndexes.length; i++) {
            int pos = initialIndexes[i];
            if (pos < fieldPos.length && pos >= 0) {
                fieldPos[pos] = 1;
            }
        }
 
        String command = scanner.nextLine();
 
        while (!command.equals("end")) {
 
            String[] data = command.split(" ");
            int initialPos = Integer.parseInt(data[0]);
            int movement = Integer.parseInt(data[2]);
            String direction = data[1];
            if (initialPos >= 0
                    && initialPos < fieldPos.length
                    && fieldPos[initialPos] == 1
                    && movement != 0) {
                fieldPos[initialPos] = 0;
                if (direction.equals("right")) {
                    while (true) {
                        if (initialPos + movement < fieldSize
                                && initialPos + movement >= 0) {
                            if (fieldPos[initialPos + movement] == 0) {
                                fieldPos[initialPos + movement] = 1;
                                break;
                            } else {
                                movement += movement;
                            }
                        } else {
                            break;
                        }
                    }
                } else if (direction.equals("left")) {
                    while (true) {
                        if (initialPos - movement >= 0
                                && initialPos - movement < fieldSize) {
                            if (fieldPos[initialPos - movement] == 0) {
                                fieldPos[initialPos - movement] = 1;
                                break;
                            } else {
                                movement += movement;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < fieldPos.length; i++) {
            System.out.print(fieldPos[i] + " ");
        }
    }
}