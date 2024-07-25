package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    void addItem(Item item) {
        if (itemCount>=items.length){
            System.out.println("장바구니가 꽉 찼습니다.");
            return;
        }

        this.items[itemCount] = item;
        itemCount ++;
    }

    void displayItems() {

        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() +", 가격 : "+item.getTotalPrice());

        }
        System.out.println("총 금액 : "+calcaulateTotalPrice() );
    }

    private int calcaulateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
