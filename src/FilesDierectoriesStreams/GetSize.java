package FilesDierectoriesStreams;

import java.io.File;
import java.util.List;

public class GetSize {
    public static void main(String[] args) {
      //  String str "C:\\Users\\Nikolay\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources"
        File file = new File("C:\\Users\\Nikolay\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        File[] files = file.listFiles();
        int sizeFolder = 0;
        if (files == null) return ;
        for (File f : files) {
            sizeFolder += f.length();
        }
        System.out.printf("Folder size: %d",sizeFolder);
    }
}
