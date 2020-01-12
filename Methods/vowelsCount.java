import java.util.Scanner;
public class voluelsCount {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in );

        String input = scanner.nextLine().toLowerCase();

        System.out.println(voluelCounter(input));
    }

    static int voluelCounter(String input){
        int counter = 0;
        for (int i = 0; i < input.length(); i ++){
            switch (input.charAt(i)){
                case 'a':
                case 'e':
                case 'y':
                case 'u':
                case 'i':
                case 'o':
                    counter++;
                    break;
            }
        }

        return counter;
    }

}
