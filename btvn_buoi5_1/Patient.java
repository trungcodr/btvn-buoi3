package btvn_buoi5_1;

public class Patient extends Person {
    private int medical;
    private String date;


    public Patient(String name, int age) {
        super(name, age);
    }

    public Patient(String name, int age, int medical, String date) {
        super(name, age);
        this.medical = medical;
        this.date = date;
    }

    public int getMedical() {
        return medical;
    }

    public void setMedical(int medical) {
        this.medical = medical;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void showInfo() {
        super.showInfo(); // Call the displayInfo of Person class
        System.out.println("So benh an: " + medical);
        System.out.println("Ngay nhap vien: " + date);
    }
}
