package Buoi8_ArrayList_TechMaster.Entites;

import java.util.List;

public class Classroom {
    private String subject;
    private List<Student> students;

    public Classroom(String subject, List<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //Them moi hoc vien
    public void addStudent(Student student){
        this.students.add(student);
    }
    @Override
    public String toString() {
        return "Classroom{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}
