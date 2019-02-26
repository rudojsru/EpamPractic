import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextReader {
    public List lines;

    {
        try {

             lines = Files.readAllLines(Paths.get("Readmy.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }


   public void printList() {

       System.out.println(lines.get(1));
    }
}
