package Buoi8_ArrayList_Tiktok.entities;

import java.util.List;

public class Tiktok {
    private List<Idols> idols;
    private List<Songs> songs;

    public Tiktok(List<Idols> idols, List<Songs> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public List<Idols> getIdols() {
        return idols;
    }

    public void setIdols(List<Idols> idols) {
        this.idols = idols;
    }

    public List<Songs> getSongs() {
        return songs;
    }

    public void setSongs(List<Songs> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
