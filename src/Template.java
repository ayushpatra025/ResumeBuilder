import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Template {
    public static String load(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
