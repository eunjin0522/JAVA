package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {


        for (int num = 2, count = 1; count <= 10; num += 2, count++) { //for문은 조건식과 증감식에 여러개를 넣을 수 있다.
            System.out.println(num);                                    // but 좋은 코드는 아님
        }

        int num = 3;
        for (int count = 1; count <= 10; count++) { //for에 있는 괄호에는 증감을 위한 식만 넣는 것으로 충분하다 (개인 취향 것)
            System.out.println(num);
            num += 3;
        }
    }
}
