package Buoi9_lab4.entites;

public class AdminEmployee extends Employee {

    public AdminEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calIncome() {
        return getBaseSalary();
    }


}
