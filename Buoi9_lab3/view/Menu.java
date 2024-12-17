package Buoi9_lab3.view;

import Buoi9_lab3.entities.Worker;
import Buoi9_lab3.service.WorkerService;

import java.util.List;
import java.util.Scanner;

public class Menu {

    WorkerService workerService = new WorkerService();
    public void displayMenu(Scanner scanner,List<Worker> workerList){
        System.out.println(
                "----------Worker Management----------\n" +
                        "1.Add Worker\n" +
                        "2.Up Salary\n" +
                        "3.Down Salary\n" +
                        "4.Display Information salary\n" +
                        "5.Exit");
        selectMenu(scanner,workerList);
    }

    public void selectMenu(Scanner scanner,List<Worker> workerList){
        System.out.print("Moi ban nhap lua chon: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Worker worker = workerService.inputInfo(scanner);
                workerList.add(worker);
                break;
            case 2:
                workerService.modifySalary(scanner,workerList,"+");
                break;
            case 3:
                workerService.modifySalary(scanner,workerList,"-");
                break;
            case 4:
                System.out.println("------------------------------");
                System.out.println(workerList);
                break;
            default:
                System.exit(0);
        }
    }
}
