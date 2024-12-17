package Buoi9_lab1.menu;

import Buoi9_lab1.entities.Student;
import Buoi9_lab1.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class Menu {
    StudentService studentService = new StudentService();
    public void inputContinue(Scanner scanner, List<Student> students) {
        do {
            Student student = studentService.inputInfo(scanner);
            students.add(student);
            System.out.println("Ban co muon nhap tiep khong?");
            String choose = scanner.nextLine();
            if (choose.equalsIgnoreCase("N")){
                break;
            }

        }
        while (true);
        System.out.println(students);
    }
}
