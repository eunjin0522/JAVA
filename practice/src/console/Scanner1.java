package console;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        sc.nextLine();

        System.out.println("=============");
        System.out.println(sc.nextLine());
        sc.close();
    }
}
