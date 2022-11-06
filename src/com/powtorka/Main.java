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

        Pies burek = new Pies();
        Pies pudel;
        Pies husky =  new Pies("Dominik",70.0);
        jamnik = new Pies(20.0, "bialy");
        Pies wilk = new Pies(husky);


    }
}

class Pies {
    private String name;
    private double energia;
    private String umaszczenie;

    public Pies() {
        energia = 50.0;
    }

    public Pies(Pies source) {
     this.umaszczenie = source.umaszczenie;
     this.energia = source.energia;
     this.name = source.name;
    }

    public Pies(double energiaPoczatkowa) {
        this.energia = energiaPoczatkowa;
    }

    public Pies(String name, double energia) {
        this.name = name;
        this.energia = energia;
    }

    public Pies(double energiaPoczatkowa, String umaszczenie) {
        this.energia = energiaPoczatkowa;
        this.umaszczenie = umaszczenie;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void spaceruj() {
        energia--;
        System.out.println(name + " teraz jest na spacerze.");
        ileEnergii();
    }

    public void jedz() {
        energia += 3;
        System.out.println(name + " teraz je.");
        ileEnergii();
    }

    public void ileEnergii() {
        System.out.println(energia);
    }

}

