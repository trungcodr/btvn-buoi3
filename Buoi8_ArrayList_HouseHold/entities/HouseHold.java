package Buoi8_ArrayList_HouseHold.entities;

import java.util.List;

public class HouseHold {
    private int id;
    private int numHouse;
    private List<Person> members;

    public HouseHold(int id, int numHouse,List<Person> members) {
        this.id = id;
        this.numHouse = numHouse;
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumHouse() {
        return numHouse;
    }

    public void setNumHouse(int numHouse) {
        this.numHouse = numHouse;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }



    @Override
    public String toString() {
        return "HouseHold{" +
                "id=" + id +
                ", numHouse=" + numHouse +
                ", members=" + members +
                '}';
    }
}


