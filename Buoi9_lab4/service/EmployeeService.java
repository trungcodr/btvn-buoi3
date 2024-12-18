package Buoi9_lab4.service;

import Buoi9_lab4.entites.AdminEmployee;
import Buoi9_lab4.entites.Employee;
import Buoi9_lab4.entites.ManagerEmployee;
import Buoi9_lab4.entites.MarketingEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    //Phuong thuc nhap nhan vien
    public void addEmployee(Scanner scanner){
        System.out.println("Moi ban nhap nhan vien(admin,marketing,manager): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("admin")){
            AdminEmployeeService adminEmployeeService = new AdminEmployeeService();
            AdminEmployee adminEmployee = adminEmployeeService.inputAdminEmployee(scanner);
            employees.add(adminEmployee);
        } else if (type.equalsIgnoreCase("marketing")) {
            MarketingEmployeeService marketingEmployeeService = new MarketingEmployeeService();
            MarketingEmployee marketingEmployee = marketingEmployeeService.inputMarketingEmployee(scanner);
            employees.add(marketingEmployee);
        } else if (type.equalsIgnoreCase("manager")) {
            ManagerEmployeeService managerEmployeeService = new ManagerEmployeeService();
            ManagerEmployee managerEmployee = managerEmployeeService.inputManagerEmployee(scanner);
            employees.add(managerEmployee);
        }
    }
    //Phuong thuc hien thi
    public void displayInfo(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

    //Phuong thuc xoa nhan vien
    public void removeEmployee(Scanner scanner,List<Employee> employees){
//        for (int i = 0;i< employees.size();i++){
//            if (employees.get(i).getId() == id) {
//                employees.remove(i);
//                break;
//            }
//        }
        System.out.println("Moi ban nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Employee employee = findbyId(id,employees);
        if (employee==null){
            System.out.println("Khong tim thay nhan vien co id: " + id);
        } else {
            //Xoa nhan vien khoi danh sach
            employees.remove(employee);
            System.out.println("Nhan vien voi id " + id + " da duoc xoa!");
        }
    }
    public Employee findbyId(int id,List<Employee> employees){
        for (Employee employee : employees){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
}
