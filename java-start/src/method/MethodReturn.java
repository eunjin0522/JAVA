package method;

public class MethodReturn  {
    public static void main(String[] args) {
        boolean result = odd(1);
        System.out.println(result);

    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
