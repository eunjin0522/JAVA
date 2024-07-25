package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {

        int x = 3;

        String result = (x % 2 == 1)? "홀수입니다." : "짝수입니다.";

        System.out.println("x는 " + result);
    }
}
