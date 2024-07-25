package array.ex;

import java.util.Scanner;

public class ArrayEx6  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();
        int[] nubmers = new int[n];
        int maxNumber,minNumber;

        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < nubmers.length; i++) {
            nubmers[i] = sc.nextInt();
        }

        maxNumber = nubmers[0];     //maxNumber = minNumber = numbers[0];도 가능 하나, 잘 사용 X
        minNumber = nubmers[0];

        for (int i = 0; i < nubmers.length; i++) {
            if (maxNumber < nubmers[i]) {
                maxNumber = nubmers[i];
            }
            if (minNumber > nubmers[i]) {
                minNumber = nubmers[i];
            }
        }

        System.out.println("가장 작은 정수 : " + minNumber);
        System.out.println("가장 큰 정수 : " + maxNumber);

    }
}
