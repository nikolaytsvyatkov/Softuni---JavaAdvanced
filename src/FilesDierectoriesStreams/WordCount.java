package FilesDierectoriesStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String path = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\input.txt";
        String path1 = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\toCount.txt";
        String outpu = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\output.txt";
        try (Scanner input = new Scanner(new FileReader(path));
        Scanner text = new Scanner(new FileReader(path1));
             PrintWriter printWriter = new PrintWriter(new FileWriter(outpu))) {
            Map<String, Integer> map = new LinkedHashMap<>();

            while (input.hasNext()) {
                String toCheck = input.next();
                if (!map.containsKey(toCheck)) {
                    map.put(toCheck, 0);
                }

            }
            while (text.hasNext()) {
                String words = text.next();
                if (map.containsKey(words)) {
                    map.put(words, map.get(words) + 1);
                }
            }
            map.entrySet().forEach(e -> {
                String key = e.getKey();
                int n = e.getValue();
                printWriter.println(String.format("%s - %d", key, n)    );
            });
        }catch (IOException e) {

        }
       // System.out.println();
    }
}
