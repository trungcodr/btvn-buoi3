package btvn_buoi5_1;

public class Doctor extends Person {
    private  String specialty;
    private  int workingHour;


    public Doctor(String name, int age) {
        super(name, age);
    }

    public Doctor(String name, int age, String specialty, int workingHour) {
        super(name, age);
        this.specialty = specialty;
        this.workingHour = workingHour;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Chuyen khoa: " + specialty);
        System.out.println("So gio lam viec: " + workingHour);
    }
}
