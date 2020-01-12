import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] numbers = sc.nextLine().split("\\s+");

        List<Double> doubleNums = new ArrayList<>();

        for (String number : numbers) {
            doubleNums.add(Double.parseDouble(number));
        }

        for (int i = 0; i < doubleNums.size() - 1; i++) {
            double firstNum = doubleNums.get(i);
            double secondNum = doubleNums.get(i + 1);

            if (firstNum == secondNum){
                double sum = firstNum + secondNum;

                doubleNums.set(i, sum);
                doubleNums.remove(i + 1);

                i = -1;
            }
        }

        System.out.println(getJoinElementsByDelimiter(doubleNums));


    }

    static String getJoinElementsByDelimiter(List<Double> doubleNums) {
        String output = "";
        DecimalFormat format = new DecimalFormat("0.#");
        for (Double number: doubleNums) {
            output += format.format(number) + " ";
        }


        return output.trim();
    }


}
