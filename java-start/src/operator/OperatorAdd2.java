package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        //전위 증감연산자
        int a = 1;
        int b = 0;

        b = ++a;    // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        //후위 증감연산자
        a = 1; //a값을 다시 1로 지정
        b = 0;

        b = a++;    //a의 현재 값을 b에 먼저 대입하고, 그 후 a의 값을 증감시킴
        System.out.println("a = " + a + ", b = " + b);


    }
}
