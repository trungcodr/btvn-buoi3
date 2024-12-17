package Buoi9_lab1;

import Buoi9_lab1.entities.Student;
import Buoi9_lab1.menu.Menu;
import Buoi9_lab1.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        Menu menu = new Menu();
        menu.inputContinue(scanner,students);
    }
}
