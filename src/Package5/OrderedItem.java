package Package5;

import Package3.Item;

public class OrderedItem {
    private int  quantity;
    public Item item;

    public OrderedItem(int quantity, Item item) {
        this.quantity = quantity;
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }
}
