package array.ex;

import java.util.Scanner;

public class ProductAdminEx_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxCount = 1;
        String[] productNames = new String[maxCount];
        int[] productPrices = new int[maxCount];
        int productCount = 0;

        while (true) {
            System.out.println("1.상품등록 | 2.상품목록 | 3.종료\n메뉴를 선택하세요: ");
            int manu = sc.nextInt();
            sc.nextLine();

            if (manu == 1) {

                if (productCount >= maxCount) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                } else {
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = sc.nextLine();

                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = sc.nextInt();

                    productCount++;
                }

            } else if (manu == 2) {
                if (productCount > 0) {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                } else {
                    System.out.println("등록된 상품이 없습니다.");
                }

            } else if (manu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
