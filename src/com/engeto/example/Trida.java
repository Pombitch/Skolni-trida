package com.engeto.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Trida {
    public static final String ODDELOVAC = "\t";
    private int rocnik;
    private String jmeno;
    private Ucitel tridniUcitel;
    private SeznamStudentu seznamStudentu;
    public static final String VYSTUPNI_SOUBOR = "vystup4C.txt";

    public Trida(int rocnik, String jmeno, Ucitel tridniUcitel, SeznamStudentu seznamStudentu) {
        this.rocnik = rocnik;
        this.jmeno = jmeno;
        this.tridniUcitel = tridniUcitel;
        this.seznamStudentu = seznamStudentu;
    }

    public int getRocnik() {
        return rocnik;
    }

    public void setRocnik(int rocnik) {
        this.rocnik = rocnik;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public Ucitel getTridniUcitel() {
        return tridniUcitel;
    }

    public void setTridniUcitel(Ucitel tridniUcitel) {
        this.tridniUcitel = tridniUcitel;
    }

    public SeznamStudentu getSeznamStudentu() {
        return seznamStudentu;
    }

    public void setSeznamStudentu(SeznamStudentu seznamStudentu) {
        this.seznamStudentu = seznamStudentu;
    }

    public void vypisTridu() {
        int rocnik = this.getRocnik();
        System.out.println("####################################");
        System.out.println("Třída: " + rocnik + "." + this.getJmeno()
                + "\t" + "(ročník: " + rocnik + ")");
        System.out.println("Třídní učitel: " + this.getTridniUcitel().getPrijmeni() + ", "
                + this.getTridniUcitel().getJmeno());
        System.out.println("Počet studentů: " + this.seznamStudentu.pocetStudentuVeTride());
        System.out.println();
        System.out.println("####################################");
        int i = 1;
        for (Student student : this.getSeznamStudentu().seznamStudentu) {
            System.out.println("# " + i++ + " # " + student.getStudentId() + " - "
                    + student.getJmeno() + " " + student.getPrijmeni() + " (" + student.getRokNarozeni() + ")");
        }
        System.out.println();

    }

    public void strucnyVypisTridy() {
       SeznamStudentu trida = this.seznamStudentu;
        System.out.println(
            this.rocnik + "."
                + this.jmeno + ", "
                + this.tridniUcitel.getJmeno() + " "
                + this.tridniUcitel.getPrijmeni());

        for (Student student : this.seznamStudentu.seznamStudentu) {
            System.out.println(
                student.getStudentId() + ", "
                + student.getJmeno() + " "
                + student.getPrijmeni());
        }
        System.out.println();
    }

    public void vypisTridyDoSouboru() throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter(new FileOutputStream(VYSTUPNI_SOUBOR));
            for (Student student : this.seznamStudentu.seznamStudentu) {
                zapis.println(student.getClass().toString() + ODDELOVAC
                    + student.getStudentId() + ODDELOVAC
                    + student.getJmeno() + ODDELOVAC
                    + student.getPrijmeni() + ODDELOVAC
                    + student.getRokNarozeni());

                //ověřovací výpis do konzole
                System.out.println(student.getClass() + ODDELOVAC
                    + student.getStudentId() + ODDELOVAC
                    + student.getJmeno() + ODDELOVAC
                    + student.getPrijmeni() + ODDELOVAC
                    + student.getRokNarozeni());
            }
    }
}
