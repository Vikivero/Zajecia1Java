package com.zadanie1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Pies wilczur = new Pies("Wilczur","Szary",20);
        Pies jamnik = new Pies("Jamnik","Rudy",30);
        Pies hucki = new Pies(70);
        Pies hucki2 = new Pies (90,"Max");
        Pies wilk = new Pies(hucki);
        Pies burek = new Pies();
        Pies jamnik2 = new Pies(80,"BiaLy");
        Pies pies1 = new Pies();
        System.out.println(pies1.umaszczenie );



        wilk.setName("Azur");



        System.out.println(wilczur.getName());
        System.out.println(jamnik.getName());
        System.out.println(wilk.getName());
        System.out.println(hucki.getName());


        wilczur.spaceruj();
        wilczur.jedz();

        jamnik.spaceruj();
        jamnik.jedz();

        hucki.spaceruj(10.0);
        hucki.spaceruj("Park wshodni");
        hucki.jedz("Pedigrii",4);
        hucki.jedz("Pedigrii", 10.5);

        wilk.jedz("Pedigrii",8);

    }
}

class Pies {

    private String name;

    private double energia_poczatkowa;

    String umaszczenie;

    public Pies() {
        this.energia_poczatkowa = 50;
    }

    public Pies(double energia_poczatkowa) {
        this.energia_poczatkowa =energia_poczatkowa;
    }

    public Pies(double energia_poczatkowa,String umaszczenie) {
        this.name = name;
        this.umaszczenie = umaszczenie;
    }

    public Pies(String name,String umaszczenie) {
        this.name = name;
        this.umaszczenie = umaszczenie;
    }

    public Pies(String name,String umasczenie,double energia_poczatkowa) {
        this.name = name;
        this.umaszczenie = umaszczenie;
        this.energia_poczatkowa = energia_poczatkowa;
    }
    public Pies(Pies kopujemy) {
        this.umaszczenie = kopujemy.umaszczenie;
        this.energia_poczatkowa = kopujemy.energia_poczatkowa;
        this.name = kopujemy.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setEnergia_poczatkowa(double energia_poczatkowa) {
        this.energia_poczatkowa = energia_poczatkowa;
    }
    public double getEnergia_poczatkowa() {
        return this.energia_poczatkowa;
    }
    public void setUmasczenie(String umasczenie) {
        this.umaszczenie = umasczenie;
    }
    public String getUmasczenie() {
        return umaszczenie;
    }

    public void spaceruj() {
        System.out.println(this.name + " teraz jest na spacerze");
    }

    public void spaceruj(Double Dystans) {
        System.out.println(this.name + " teraz jest na spacerze " +  Dystans);
    }

    public void spaceruj(String mejsceSpaceru) {
        System.out.println(this.name + " teraz spaceruje w  " + mejsceSpaceru);
    }

    public void dajGlos() {
        System.out.println("HauHau");
    }

    public void jedz() {
        System.out.println(this.name + " teraz je");
    }

     public void jedz(String TypKarmy) {
        System.out.println(this.name + " zaczal jesc karme " + TypKarmy);
    }

    public void jedz(String TypKarmy, int jakLubie) {
        Random los1 = new Random();
        if (jakLubie > los1.nextInt() % 10 + 1) {
            System.out.println(this.name + " nie chial zjesc " + TypKarmy);
        } else {
            System.out.println(this.name + "zjadl " + TypKarmy);
        }
    }

    public void jedz(String TypKarmy, double nowa_energia) {
        if (this.energia_poczatkowa + nowa_energia > 100.0) {
            System.out.println(this.name + "zjadl " + (100.0 - this.energia_poczatkowa) + "karmy " + TypKarmy);
        } else {
            System.out.println(this.name + " Zjadl cala karme " + TypKarmy);
        }
    }
}
