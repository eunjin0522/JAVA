package ref.ex;


public class ProductOrderMain2_1 {
    public static void main(String[] args) {
        ProductOrder[] order = new ProductOrder[3];
        order[0] = createdOrder("두부", 2000, 2);
        order[1] = createdOrder("김치", 5000, 1);
        order[2] = createdOrder("콜라", 1500, 3);

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
