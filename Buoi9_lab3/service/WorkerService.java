package Buoi9_lab3.service;

import Buoi9_lab3.entities.Worker;

import java.util.List;
import java.util.Scanner;

public class WorkerService {
    //Hien thi menu
    public Worker inputInfo(Scanner scanner){
        System.out.print("Nhap ten cong nhan: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi cong nhan: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap luong cong nhan: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap dia diem lam viec: ");
        String workPlace = scanner.nextLine();

        return new Worker(name,age,salary,workPlace);
    }

    //Chuc nang tang giam luong cho cong nhan
    public void modifySalary(Scanner scanner,List<Worker> workerList,String type){
        System.out.print("Moi ban nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Worker worker = findById(id,workerList);
        if (worker==null){
            System.out.println("K tim thay cong nhan co id: " + id);
        }
        else {
            if (type.equals("-")){
                System.out.println("Moi ban nhap so tien muon giam: ");
                double money = Double.parseDouble(scanner.nextLine());
                worker.setSalary(worker.getSalary()-money);
            } else {
                System.out.println("Moi ban nhap so tien muon tang: ");
                double money = Double.parseDouble(scanner.nextLine());
                worker.setSalary(worker.getSalary()+money);
            }
        }

    }

    //Tim cong nhan bang id
    public Worker findById(int id, List<Worker> workerList){
        for (Worker worker : workerList){
            if (worker.getId()==id) {
                return worker;
            }
        }
        return null;
    }
}
