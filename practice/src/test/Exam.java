package test;

public class Exam {
    public static int[] make(int n) {
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = i*2;
        }
        return t;
    }

    public static void main(String[] args) {
        int[] a = make(5);
        for (int i = 0; i < a.length; i++) {
            int c = i%2;
            System.out.println(c);
            if (c == 0)continue;
            System.out.println("*");
            System.out.print(a[i]+" ");
        }
    }
}
