package com.engeto.example;

import java.util.ArrayList;

public class SeznamStudentu {
    ArrayList<Student> seznamStudentu = new ArrayList<>();

    public void pridejStudenta(Student student) {
        seznamStudentu.add(student);
    }

    public int pocetStudentuVeTride() {
        int pocet = seznamStudentu.size();
    return pocet;
    }


}

