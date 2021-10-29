
public class OrderedItem {
    private int  quantity;
    Item item;

    public OrderedItem(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }
}
