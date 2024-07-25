package loop;

public class For2 {
    public static void main(String[] args) {

        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + 1;
            System.out.println("i= " + i + " sum= " + sum);
        }
        //for문이 깔끔하게 보이는 이유는 가독성이 좋고, 카운터 변수를 다른 부분과 명활하게 구분할 수 있기 때문이다.
        //for(초기식; 조건식; 증감식) 구조로 한 번에 눈에 보임
        //개발자는 루프 횟수와 관련된 코드와 나머지 코드를 명확하게 구분할 수 있다.
    }
}
