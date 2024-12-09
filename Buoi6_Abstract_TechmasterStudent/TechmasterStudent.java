package Buoi6_Abstract_TechmasterStudent;

public abstract class TechmasterStudent {
    private String name;
    private String major;

    public TechmasterStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public TechmasterStudent() {

    }


    public abstract double getScore();
    public  String getPerformance(){
        double score = getScore();
        if (score <5){
            return "Yeu";
        }
        else if (score <6.5){
            return "Trung binh";
        }
        else if (score < 7.5) {
            return "Kha";
        }
        else if (score <=10){
            return "Gioi";
        }
        else  return "Khong hop le!";
    };

    public void display() {
        System.out.println("Ho va ten:" + name);
        System.out.println("Nganh: " + major);
        System.out.printf("Diem: " + String.format("%.2f", getScore()) +"\n");
        System.out.println("Hoc luc: " + getPerformance());
    }
}
