package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("max : " + max + " 합계 : " +sum);
    }
}
