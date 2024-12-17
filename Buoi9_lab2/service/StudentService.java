package Buoi9_lab2.service;

import Buoi9_lab2.entities.Student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner){
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap diem mon toan: ");
        double scoreMath = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap diem mon vat ly: ");
        double scorePhysic = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap diem mon hoa hoc: ");
        double scoreChemistry = Double.parseDouble(scanner.nextLine());
        return new Student(name,scoreMath,scorePhysic,scoreChemistry);
    }

    public String classification(Student student){
        double avgScore = (student.getScoreMath()+student.getScorePhysic()+student.getScoreChemistry())/3;
        if (avgScore>=8){
            return "A";
        }
        else if (avgScore>=6.5){
            return "B";
        }
        else {
            return "C";
        }
    }
    public void calPercent(List<Student> students){
        int total = students.size();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (Student student : students){
            switch (classification(student)){
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
            }
        }
        System.out.println("Phan tram hoc sinh:");
        System.out.println("%A: " + (countA*100)/total);
        System.out.println("%B: " + (countB*100)/total);
        System.out.println("%C: " + (countC*100)/total);



    }
}
