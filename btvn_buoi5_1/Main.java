package btvn_buoi5_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten benh nhan: ");
        String namePatient = scanner.nextLine();
        System.out.print("Tuoi benh nhan: ");
        int agePatient = Integer.parseInt(scanner.nextLine());
        System.out.print("So benh an: ");
        int medical = Integer.parseInt(scanner.nextLine());
        System.out.print("Ngay nhap vien(YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.println("-------------------------------------------------------------------------");
        Patient patient = new Patient(namePatient,agePatient,medical,date);

        System.out.print("Ten bac si: ");
        String nameDoctor = scanner.nextLine();
        System.out.print("Tuoi bac si: ");
        int ageDoctor = Integer.parseInt(scanner.nextLine());
        System.out.print("Chuyem khoa: ");
        String specialty = scanner.nextLine();
        System.out.print("So gio lam viec: ");
        int workingHour = Integer.parseInt(scanner.nextLine());
        System.out.println("-----------------------------------**------------------------------------");
        Doctor doctor = new Doctor(nameDoctor,ageDoctor,specialty,workingHour);

        ManageHospital manageHospital = new ManageHospital(doctor,patient);
        manageHospital.showInfoALL();
    }
}
