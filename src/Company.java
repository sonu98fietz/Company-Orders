
public class Company {
	
    static Item item1 = new Item("Jacket", 1200);
    static Item item2 = new Item("Jeans", 1000);
    static Item item3 = new Item("Casual Shirt", 900);
    static Item item4 = new Item("Blazer", 2500);
    Item[] items = {item1, item2, item3, item4};
    
    private RegCustomer customer1 = new RegCustomer();
    private RegCustomer customer2 = new RegCustomer();

    
    Customer[] customers = {customer1, customer2};

    public double getTotalWorthOfOrdersPlaced() {
        double total = 0;
        for (Customer customer : customers) 
        {
            float discountPercent = 0;
            if(customer instanceof RegCustomer)
            {
                discountPercent = 20;
            }
            for(Order order : customer.orders)
            {
                for(OrderedItem orderedItem : order.orderedItems)
                {
                    total += orderedItem.getQuantity() * (orderedItem.item.getRate()*((100-discountPercent)/100));
                }
            }
        }
        return total;
    }
    
}

