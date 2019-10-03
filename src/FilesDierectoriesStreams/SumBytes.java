package FilesDierectoriesStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SumBytes   {
    public static void main(String[] args) {
        int sum = 0;
        String path = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\input.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        }catch (IOException e)   {

        }
    }
}
