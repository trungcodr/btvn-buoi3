package Buoi8_ArrayList_Tiktok.service;

import Buoi8_ArrayList_Tiktok.entities.Songs;

import java.util.Scanner;

public class SongService {
    public Songs inputSong(Scanner scanner){
        System.out.print("Nhap id cua bai hat: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap ten bai hat: ");
        String name = scanner.nextLine();
        System.out.print("Nhap ten ca si: ");
        String singer = scanner.nextLine();
        return new Songs(id,name,singer);
    }
}
