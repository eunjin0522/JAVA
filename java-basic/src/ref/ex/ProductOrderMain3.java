package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int number = sc.nextInt();
        sc.nextLine();

        ProductOrder[] order = new ProductOrder[number];

        for (int i = 0; i < order.length; i++) {
            System.out.print((i + 1) + "번째 주문 정보를 입력하세요.\n상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int productPrice = sc.nextInt();
            sc.nextLine();
            System.out.print("수량: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            order[i] = createdOrder(productName, productPrice, productQuantity);
        }

        printOrders(order);

        int totalAmount = getTotalAmount(order);

        System.out.println("최종금액: "+ totalAmount);

    }

    static ProductOrder createdOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;

    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);

        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }
}
