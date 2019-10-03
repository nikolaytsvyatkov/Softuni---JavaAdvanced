package FilesDierectoriesStreams;

import java.io.*;
import java.util.Scanner;

public class AllCapitals {
    public static void main(String[] args) {
        String path = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\input.txt";
        String path1 = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\output.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
             PrintWriter printWriter = new PrintWriter(new FileWriter(path1))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isLowerCase(line.charAt(i))) {
                        sb.append(Character.toUpperCase(line.charAt(i)));
                    } else {
                        sb.append(line.charAt(i));
                    }
                }
                printWriter.println(sb.toString());
                sb = new StringBuilder();
                line = bufferedReader.readLine();
            }

        }catch (IOException e) {

        }
    }
}
