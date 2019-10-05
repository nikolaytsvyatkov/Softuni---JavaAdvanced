package FilesDierectoriesStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class MergeFiels {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Path path1 = Paths.get("C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\input.txt" );
        Path path2 = Paths.get("C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\toCount.txt");
        Path path3 = Paths.get("C:\\Users\\Nikolay\\IdeaProjects\\JavaAdvanced\\src\\output.txt");



        List<String> list = Files.readAllLines(path1);
        List<String> list1 = Files.readAllLines(path2);

        list.addAll(list1);
        Files.write(path3,list);

    }
}
