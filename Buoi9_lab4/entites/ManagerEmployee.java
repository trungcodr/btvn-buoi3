package Buoi9_lab4.entites;

public class ManagerEmployee extends Employee{
    private double responsibilitySalary;

    public ManagerEmployee(String name, double baseSalary, double responsibilitySalary) {
        super(name, baseSalary);
        this.responsibilitySalary = responsibilitySalary;
    }

    @Override
    public double calIncome() {
        return getBaseSalary()+responsibilitySalary;
    }
}
