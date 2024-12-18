package Buoi9_lab4.entites;

public abstract class Employee {
    private static int autoID;
    private int id;
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.id = ++autoID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calIncome();
    //Ham tinh thue thu nhap
    public double calTax(){
        double income = calIncome();
        if (income>11000000){
            return (income*10)/100;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + baseSalary +
                '}';
    }
}
