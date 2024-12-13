package Buoi8_ArrayList_Tiktok.entities;

public class Followers {
    private String name;
    private int id;
    private String email;
    private int numberOfLike;

    public Followers(String name, int id, String email, int numberOfLike) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Followers{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
