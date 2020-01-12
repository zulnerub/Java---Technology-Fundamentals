import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class courses {
    public static void main(String[] args) throws IOException {
        BufferedReader rd =
                new BufferedReader(
                       new InputStreamReader(
                                System.in
                        )
                );

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = "";

        while(!"end".equals(input = rd.readLine())){
            String[] data = input.split(" : ");
            if (!courses.containsKey(data[0])){
                courses.put(data[0], new ArrayList<>());
                courses.get(data[0]).add(data[1]);
            }else{
                courses.get(data[0]).add(data[1]);
            }
        }

        courses.entrySet().stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    
                    return sort;
                })
                .forEach(e -> {
                    System.out.println(
                            String.format("%s: %d", e.getKey(), e.getValue().size())
                    );
                    e.getValue().sort((d1, d2) -> {
                        int sortZero = d1.compareTo(d2);
                        return sortZero;
                    });
                    for (int i = 0; i < e.getValue().size(); i++) {
                        System.out.println(
                                String.format("-- %s", e.getValue().get(i))
                        );
                    }
                });
    }
}
