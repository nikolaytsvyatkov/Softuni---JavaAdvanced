package FilesDierectoriesStreams;

import java.io.*;
import java.util.Scanner;

public class LineNUmbers {
    public static void main(String[] args) {
        String path = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\input.txt";
        String path1 = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\output.txt";
        int count = 1;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        PrintWriter out = new PrintWriter(new FileWriter(path1))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                out.println(count + ". " + line);
                count++;
                line = bufferedReader.readLine();
            }

        }catch (IOException e) {

        }
    }
}
