package com.powtorka;

public class Main {
    public static void main(String[] args) {
        Pies wilczur = new Pies();
        Pies jamnik = new Pies();

        jamnik.setName("Szarik");
        wilczur.setName("Azur");

        System.out.println("Imiona psow :" + jamnik.getName() + "\n" + wilczur.getName());

        jamnik.spaceruj();
        wilczur.spaceruj();
        jamnik.jedz();
        wilczur.jedz();
    }
}

class Pies {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spaceruj() {
        System.out.println(name + " teraz jest na spacerze.");
    }

    public void jedz() {
        System.out.println(name + " teraz je.");
    }
}

