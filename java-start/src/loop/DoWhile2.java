package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        //do while은 기본적으로 한 번 실행하고 조건을 확인한다.
        //조건에 상관없이 최소 한 번은 실행되어야할 때 적합
        //반복문 실행 횟수는 while문과 동일하다

        do {
            System.out.println("현재 숫자는: " + i);
            i++;
        } while (i < 3);

    }
}
