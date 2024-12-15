package Buoi8_ArrayList_TechMaster.Entites;

import java.util.List;

public class TechMaster {
    private String manage;
    private  String teacher;
    private Classroom classrooms;

    public TechMaster(String manage, String teacher, Classroom classrooms) {
        this.manage = manage;
        this.teacher = teacher;
        this.classrooms = classrooms;
    }

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }



    @Override
    public String toString() {
        return "TechMaster{" +
                "manage='" + manage + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classrooms=" + classrooms +
                '}';
    }
    public void showInfo(){
        System.out.println(toString());
    }
}
