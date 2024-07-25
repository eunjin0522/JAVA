package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for ( int i = 1; ; i++ ) {       //조건식이 없으면 for은 무한반복임
            sum = sum + i;
            if (sum >= 10) {
                System.out.println("합이 10보다 크면 종료: i = " + i + " sum= " + sum);
                break;

            }


            i++;
        }
    }
}
