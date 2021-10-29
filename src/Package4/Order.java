package Package4;

import Package1.Company;
import Package5.OrderedItem;

public class Order {
	
    private OrderedItem item1 = new OrderedItem(2,Company.item1);
    private OrderedItem item2 = new OrderedItem(3,Company.item2);
    private OrderedItem item3 = new OrderedItem(1,Company.item3);
    private OrderedItem item4 = new OrderedItem(2,Company.item4);
    
    public OrderedItem[] orderedItems = {item1,item2,item3,item4};
}
