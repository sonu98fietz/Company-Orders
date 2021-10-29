

public class Item {
    private String description;
    private double rate;

    public double getRate() {
        return rate;
    }

    public Item(String description, double rate) {
        this.description = description;
        this.rate = rate;
    }
}
