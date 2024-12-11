package Buoi7_Interface_ManageStudent;

public class Student implements Iclassification {
    private String name;
    private int age;
    private double marks;
    private String classification;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public void classify() {
        if (marks >=8) {
            classification="A";
        } else if (marks<8 && marks > 6.5) {
            classification="B";
        }
        else {
            classification="C";
        }
    }

    @Override
    public void display() {
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Tuoi sinh vien: "+ age);
        System.out.println("Diem cua sinh vien: " + marks);
        System.out.println("Hoc luc: " +classification);
    }
}
