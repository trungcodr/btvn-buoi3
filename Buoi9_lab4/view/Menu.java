package Buoi9_lab4.view;

import Buoi9_lab4.entites.Employee;
import Buoi9_lab4.service.EmployeeService;

import java.util.List;
import java.util.Scanner;

public class Menu {
    EmployeeService employeeService = new EmployeeService();
    //HIen thi Menu
    public void displayMenu(Scanner scanner,List<Employee> employees){
        System.out.println("Menu");
        System.out.println("1.Add Employee");
        System.out.println("2.Display Employee");
        System.out.println("3.Remove Employee");
        System.out.println("0.Exit");
        selectMenu(scanner,employees);
    }
    //Chon chuc nang trong Menu
    public void selectMenu(Scanner scanner,List<Employee> employees){
        System.out.println("Moi ban nhap lua chon: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                employeeService.addEmployee(scanner);
                break;
            case 2:
                employeeService.displayInfo();
                break;
            case 3:
                employeeService.removeEmployee(scanner,employees);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Nhap khong hop le! Moi ban nhap lai.");
        }

    }
}
