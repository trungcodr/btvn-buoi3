package Buoi8_ArrayList_Tiktok.service;

import Buoi8_ArrayList_Tiktok.entities.Followers;
import Buoi8_ArrayList_Tiktok.entities.Idols;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdolService {
    //Nhap thong tin idol
    public Idols  inputIdol(Scanner scanner,FollowerService followerService){
        System.out.print("Nhap ten cua idol: ");
        String name = scanner.nextLine();
        System.out.print("Nhap id cua idol: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap email cua idol: ");
        String email = scanner.nextLine();
        System.out.print("Nhap nhom cua idol: ");
        String group = scanner.nextLine();
        //Nhap so luong nguoi theo doi
        System.out.print("Nhap so luong nguoi theo doi: ");
        int numFollower = Integer.parseInt(scanner.nextLine());
        List<Followers>followers = new ArrayList<>();
        for (int i = 0;i< numFollower;i++){
            System.out.println("Nhap thong tin cho nguoi theo doi thu " + (i+1)+ ": ");
            followers.add(followerService.inputFollower(scanner));
        }
        return new Idols(name,id,email,followers,group);

    }
}
