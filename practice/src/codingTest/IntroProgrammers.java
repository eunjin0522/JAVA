package codingTest;

import java.util.Arrays;

public class IntroProgrammers {
//배열 자르기 : 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return
    //Arrays의 copyOfRange 사용 (original 배열, 시작할 index, 끝index(해당 인덱스 미포함))
    public int[] solution1(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers,num1,num2+1);
    }
    //for문 사용
    public int[] solution2(int[] numbers, int num1, int num2) {
        int[] answer = new int[(num2-num1+1)];
        int j = 0;
        for(int i = num1; i <= num2 ; i++){
            answer[j] = numbers[i];
            j ++;
        }
        return answer;
    }
//외계행성의 나이 :  a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현
    public static String solution3(int age) {
        String answer = "";
        String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
        while (age > 0) {
            answer = arr[age%10]+answer;
            age /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        String age = solution3(100);
        System.out.println(age);
    }

}
