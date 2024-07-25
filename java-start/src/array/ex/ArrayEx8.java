package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int n = sc.nextInt();

        int[][] scores = new int[n][3];
        String[] subjects = {"국어", "수학", "영어"};

        //성적입력받기
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = sc.nextInt();
            }
        }

        //총점, 평균, 출력
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double arg = (double) sum / scores[i].length;

            System.out.println((i+1)+"번 학생의 총점: "+sum+" ,평균: "+arg);
        }
    }
}
