package console;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample2 {
    public static void main(String[] args) throws IOException {
        PrintWriter output = new PrintWriter("C:out.txt");
        for (int i = 0; i < 11; i++) {
            String data = i + "번째 줄입니다.";
            output.println(data);

        }
        output.close();

        PrintWriter addOutput = new PrintWriter(new FileWriter("C:out.txt",true)); //true를 반드시 써야 추가모드가 됨
        for (int i = 11; i < 15; i++) {
            String data = "추가로 작성한 "+i + "번째 줄입니다.";
            addOutput.println(data);
        }
        addOutput.close();
    }
}
