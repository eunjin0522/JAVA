package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 4000, 3);
        Item item23 = new Item("dd", 522, 23);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item23);

        cart.displayItems();
    }
}
