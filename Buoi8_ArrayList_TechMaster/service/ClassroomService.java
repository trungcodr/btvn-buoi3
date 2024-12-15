package Buoi8_ArrayList_TechMaster.service;

import Buoi8_ArrayList_TechMaster.Entites.Classroom;
import Buoi8_ArrayList_TechMaster.Entites.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassroomService {
    public Classroom inputClassroom(Scanner scanner, StudentService studentService){
        System.out.print("Nhap ten mon hoc: ");
        String subject = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        Classroom classroom = new Classroom(subject,students);
        System.out.print("Nhap so luong hoc vien: ");
        int numStudent = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i< numStudent;i++){
            System.out.println("Nhap thong tin cho hoc vien thu " + (i+1)+ ": ");
            Student student = studentService.inputStudent(scanner);
            classroom.addStudent(student);
        }
        return classroom;
    }

    public void addStudent(Scanner scanner, Classroom classroom){
        System.out.print("Nhap ID hoc vien: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap ten hoc vien: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi hoc vien: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap hoc luc cua hoc vien: ");
        String classification = scanner.nextLine();
        Student student = new Student(id,name,age,classification);
        classroom.addStudent(student);
    }
}
