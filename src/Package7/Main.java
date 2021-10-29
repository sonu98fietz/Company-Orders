package Package7;

import Package1.Company;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        System.out.println("Total amount to be paid is " + company.getTotalWorthOfOrdersPlaced());
    }
}
