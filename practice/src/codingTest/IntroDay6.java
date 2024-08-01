package codingTest;

import java.util.Scanner;


public class IntroDay6 {
//    n번 만큼 분자 반복 출력하기
    public static String solution(String my_string, int n) {
        String answer = "";
        for(int i =0 ;i<my_string.length(); i++){
            String ch = Character.toString(my_string.charAt(i));
            answer = answer + ch.repeat(n);
        }
        return answer;
    }
//    특정문자 삭제하기
    public static String solution2(String my_string, String letter) {

        return my_string.replace(letter,"");
//        String answer = "";
//        for(char ch : my_string.toCharArray()){
//            if(!(ch+"").equals(letter)) answer = answer + (ch+"");
//        }
//        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }

    }
}
