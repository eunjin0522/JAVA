package test;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("피라미드 층수 :");
        int starCount = sc.nextInt();
        int up = starCount/2;
        int down = up+1;

        for (int i = 0; i < up; i++) {
            for (int j = 0; j < up-i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i * 2 + 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = down; i > 0; i--) {
            for (int j = 0; j < down-i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i * 2 - 1; l++) {
                System.out.print("*");
            }
            System.out.println();


        }


    }
}
