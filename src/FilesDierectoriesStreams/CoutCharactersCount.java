package FilesDierectoriesStreams;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoutCharactersCount {
    public static void main(String[] args) {
        String path = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\input.txt";
        String path1 = "C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\output.txt";
        List<Character> list = Arrays.asList('a','o','e','i','u');
        List<Character> punction = Arrays.asList('.','?',',','!');

        int vowels = 0;
        int punctions = 0;
        int consonants = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
             PrintWriter printWriter = new PrintWriter(new FileWriter(path1))) {
            int  line = bufferedReader.read();
            while (line >= 0)   {
                if (list.contains((char)line))   {
                    vowels++;
                } else if (punction.contains(((char) line))) {
                    punctions++;
                } else if (!Character.toString(line).equals(" ")) {
                    consonants++;
                }

                line = bufferedReader.read();
            }
            printWriter.println("Vowels: " + vowels);
            printWriter.println("Consonants: " + consonants);
            printWriter.println("Punctuation: " + punctions);

        } catch (IOException e) {

        }
    }
}
