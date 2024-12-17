package Buoi9_lab1.service;

import Buoi9_lab1.entities.Student;

import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner){
        System.out.print("Nhap ten sinh vien: ");
        String name = scanner.nextLine();
        System.out.print("Nhap dia chi sinh vien: ");
        String address = scanner.nextLine();
        return new Student(name,address);

    }
}
