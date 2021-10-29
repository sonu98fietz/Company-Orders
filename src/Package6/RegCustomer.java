package Package6;

import Package2.Customer;

public class RegCustomer extends Customer {
    private double splDiscount;

    public double getSplDiscount() {
		return splDiscount;
	}

	public void setSplDiscount(double splDiscount) {
		this.splDiscount = splDiscount;
	}

	public double getSpecialDiscount(){
        return 0;
    }
}

