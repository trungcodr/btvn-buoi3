package Buoi7_Interface_ManageStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi sinh vien: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap diem sinh vien: ");
        double marks = Double.parseDouble(scanner.nextLine());

        Student student = new Student(name,age,marks);
        student.classify();
        student.display();
    }
}
