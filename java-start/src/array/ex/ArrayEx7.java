package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] studentsScore = new int[4][3];
        int[] studentSum = new int[4];
        double[] studentArg = new double[4];

        //성적입력받기
        for (int i = 0; i < studentsScore.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            System.out.print("국어 점수: ");
            studentsScore[i][0] = sc.nextInt();
            System.out.print("수학 점수: ");
            studentsScore[i][1] = sc.nextInt();
            System.out.print("영어 점수: ");
            studentsScore[i][2] = sc.nextInt();
        }

        //총점
        for (int i = 0; i < studentsScore.length; i++) {
            int sum = 0;
            for (int j = 0; j < studentsScore[i].length; j++) {
                sum += studentsScore[i][j];
            }
            studentSum[i] = sum;
        }

        //평균
        for (int i = 0; i < studentSum.length; i++) {
            double arg = (double) studentSum[i] / 3;
            studentArg[i] = arg;
        }

        //출력
        for (int i = 0; i < studentSum.length; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + studentSum[i] + ", 평균: " + studentArg[i]);
        }

    }
}
