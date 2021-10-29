package Package1;

import Package3.Item;
import Package6.RegCustomer;
import Package2.Customer;
import Package5.OrderedItem;
import Package4.Order;

public class Company {
	
    public static Item item1 = new Item("Jacket", 1200);
    public static Item item2 = new Item("Jeans", 1000);
    public static Item item3 = new Item("Casual Shirt", 900);
    public static Item item4 = new Item("Blazer", 2500);
    Item[] items = {item1, item2, item3, item4};
    
    private Customer customer1 = new Customer();
    
    Customer[] customers = {customer1};

    public double getTotalWorthOfOrdersPlaced() 
    {
        double total = 0;
        
        for (Customer customer : customers) 
        {
            float discPercent = 0;
            if(customer instanceof RegCustomer)
            {
                discPercent = 20;
            }
            for(Order order : customer.orders)
            {
                for(OrderedItem orderedItem : order.orderedItems)
                {
                    total += orderedItem.getQuantity() * (orderedItem.item.getRate()*((100-discPercent)/100));
                }
            }
        }
        return total;
    }
    
}

