package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrder = new ProductOrder[3];
        productOrder[0] = createOrder("두부", 2000, 2);
        productOrder[1] = createOrder("김치", 5000, 1);
        productOrder[2] = createOrder("콜라", 1500, 3);

        printOrders(productOrder);

        int totalPrice = getTotalAmount(productOrder);


        System.out.println("최종금액: "+ totalPrice);

    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) { //명,가격,수량 출력,
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);

        }
    }

    static int getTotalAmount(ProductOrder[] orders) { //총결제 금액 계산 , 결과 반환
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;

        }
        return totalPrice;
    }
}
