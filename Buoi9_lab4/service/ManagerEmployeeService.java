package Buoi9_lab4.service;

import Buoi9_lab4.entites.ManagerEmployee;

import java.util.Scanner;

public class ManagerEmployeeService {
    public ManagerEmployee inputManagerEmployee(Scanner scanner){
        System.out.println("Nhap ten truong phong: ");
        String name = scanner.nextLine();
        System.out.println("Nhap luong co ban cua truong phong: ");
        double baseSalary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap luong trach nhiem: ");
        double reponsibilitySalary = Double.parseDouble(scanner.nextLine());
        return new ManagerEmployee(name,baseSalary,reponsibilitySalary);
    }
}
