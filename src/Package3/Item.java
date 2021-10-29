package Package3;

public class Item {
    private String description;
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	private double rate;

    public double getRate() {
        return rate;
    }

    public Item(String description, double rate) {
        this.description = description;
        this.rate = rate;
    }
}
