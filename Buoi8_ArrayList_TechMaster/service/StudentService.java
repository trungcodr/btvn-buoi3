package Buoi8_ArrayList_TechMaster.service;

import Buoi8_ArrayList_TechMaster.Entites.Student;

import java.util.Scanner;

public class StudentService {
    public Student inputStudent(Scanner scanner){
        System.out.print("Nhap ID hoc vien: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap ten hoc vien: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi hoc vien: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap hoc luc cua hoc vien: ");
        String classification = scanner.nextLine();
        return new Student(id,name,age,classification);
    }
}
