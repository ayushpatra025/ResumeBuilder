import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    public static void save(String content, String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
}
