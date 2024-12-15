package Buoi8_ArrayList_TechMaster.Entites;

public class Student {
    private int id;
    private String name;
    private int age;
    private String classification;

    public Student(int id, String name, int age, String classification) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classification = classification;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classification='" + classification + '\'' +
                '}';
    }
}
