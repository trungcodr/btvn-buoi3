package Buoi8_ArrayList_Tiktok.service;

import Buoi8_ArrayList_Tiktok.entities.Idols;
import Buoi8_ArrayList_Tiktok.entities.Songs;
import Buoi8_ArrayList_Tiktok.entities.Tiktok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiktokService {
    public Tiktok inputTiktok(Scanner scanner, SongService songService, IdolService idolService, FollowerService followerService) {
        System.out.println("Nhap so luong idol: ");
        int numIdol = Integer.parseInt(scanner.nextLine());

        List<Idols> idols = new ArrayList<>();
        for (int i = 0; i< numIdol;i++){
            System.out.println("Nhap thong tin cho idol thu " + (i+1)+ ": ");
            idols.add(idolService.inputIdol(scanner,followerService));
        }
        System.out.print("Nhap so luong bai hat: ");
        int numSong = Integer.parseInt(scanner.nextLine());

        List<Songs> songs = new ArrayList<>();
        for (int i = 0;i< numSong;i++){
            System.out.println("Nhap thong tin cho bai hat thu " + (i+1)+ ": ");
            songs.add(songService.inputSong(scanner));
        }
        return new Tiktok(idols,songs);
    }
}
