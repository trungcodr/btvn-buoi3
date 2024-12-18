package Buoi9_lab4;

import Buoi9_lab4.entites.Employee;
import Buoi9_lab4.view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        Menu menu = new Menu();
        do {
            menu.displayMenu(scanner,employees);
        }
        while (true);

    }
}
