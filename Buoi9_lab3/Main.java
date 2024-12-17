package Buoi9_lab3;

import Buoi9_lab3.entities.Worker;
import Buoi9_lab3.service.WorkerService;
import Buoi9_lab3.view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Worker> workerList = new ArrayList<>();
        Menu menu = new Menu();
        do {
            menu.displayMenu(scanner,workerList);
        }
        while (true);
    }


}
