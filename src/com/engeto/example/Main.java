package com.engeto.example;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Student student;
        Ucitel tridniUcitel4C;
        Trida trida4C;
        SeznamStudentu seznamStudentu4C = new SeznamStudentu();

        //Vytvoření studentů a zařazení do trídy
        student = new Student("Petr", "Svoboda", 2011, "ID001");
        seznamStudentu4C.pridejStudenta(student);
        student = new Student("Milan", "Říha", 2010, "ID123");
        seznamStudentu4C.pridejStudenta(student);
        student = new Student("Jindřich", "Nový", 2012, "ID345");
        seznamStudentu4C.pridejStudenta(student);

        //Vytvoření třídního učitele
        tridniUcitel4C = new Ucitel("Jan", "Novák");

        //Vytvoření třídy 4.C
        trida4C = new Trida(4,"C",tridniUcitel4C,seznamStudentu4C);

        //Kompletní výpis třídy 4.C
        trida4C.vypisTridu();

        //Stručný výpis třídy 4.C
        trida4C.strucnyVypisTridy();

        //Vypis do souboru
        try {
            trida4C.vypisTridyDoSouboru();
        } catch (FileNotFoundException e) {
            System.err.println("Chyba v zápisu do souboru." + e.getMessage());
        }
    }
}
