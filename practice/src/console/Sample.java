package console;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        String filePath = "C:out.txt";

        File file = new File(filePath);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream output = new FileOutputStream(file);
        output.close();
    }
}
