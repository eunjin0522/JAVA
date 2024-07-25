package console;

import java.io.IOException;

import java.io.InputStream;

public class ConInOut {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int a;
        int b;

        a = in.read();
        b = in.read();

        System.out.println(a);
        System.out.println(b);

    }
}
