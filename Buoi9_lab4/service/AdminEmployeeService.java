package Buoi9_lab4.service;

import Buoi9_lab4.entites.AdminEmployee;

import java.util.Scanner;

public class AdminEmployeeService {
    //Phuong thuc nhap thong tin nhan vien hanh chinh
    public AdminEmployee inputAdminEmployee(Scanner scanner){
        System.out.print("Moi ban nhap ten nhan vien: ");
        String name = scanner.nextLine();
        System.out.print("Moi ban nhap luong co ban cua nhan vien: ");
        double baseSalary = Double.parseDouble(scanner.nextLine());
        return new AdminEmployee(name,baseSalary);
    }
}
