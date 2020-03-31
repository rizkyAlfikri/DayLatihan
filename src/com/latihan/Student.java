package com.latihan;

import java.util.List;

public class Student {
    private String name;
    private int ID;
    private List<Pelajaran> pelajaran;

    public Student(String name, int ID, List<Pelajaran> pelajaran) {
        this.name = name;
        this.ID = ID;
        this.pelajaran = pelajaran;
    }

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Pelajaran> getPelajaran() {
        return pelajaran;
    }

    public void setPelajaran(List<Pelajaran> pelajaran) {
        this.pelajaran = pelajaran;
    }
}
