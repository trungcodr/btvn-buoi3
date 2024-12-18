package Buoi9_lab4.entites;

public class MarketingEmployee extends Employee {
    private double sales;
    private double commission;

    public MarketingEmployee(String name, double baseSalary, double sales, double commission) {
        super(name, baseSalary);
        this.sales = sales;
        this.commission = commission;
    }

    //Ham tinh luong nhan vien tiep thi
    @Override
    public double calIncome() {
        return getBaseSalary()+(sales*commission/100);
    }
}
