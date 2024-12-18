package Buoi9_lab4.service;

import Buoi9_lab4.entites.MarketingEmployee;

import java.util.Scanner;

public class MarketingEmployeeService {
    //Phuong thuc nhap thong tin nhan vien tiep thi
    public MarketingEmployee inputMarketingEmployee(Scanner scanner){
        System.out.println("Moi ban nhap ten nhan vien: ");
        String name = scanner.nextLine();
        System.out.println("Moi ban nhap luong co ban: ");
        double baseSalary = Double.parseDouble(scanner.nextLine());
        System.out.println("Moi ban nhap doanh so: ");
        double sales = Double.parseDouble(scanner.nextLine());
        System.out.println("Moi ban nhap thuong hoa hong: ");
        double commission = Double.parseDouble(scanner.nextLine());
        return new MarketingEmployee(name,baseSalary,sales,commission);
    }
}
