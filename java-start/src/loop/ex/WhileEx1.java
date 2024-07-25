package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println(count++); // 출력을 하고 이후에 값 증가 보기 훨 편함
           // count++;
        }
    }
}
