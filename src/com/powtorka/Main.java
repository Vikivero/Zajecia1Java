package com.powtorka;

public class Main {
    public static void main(String[] args) {
        Pies0 wilczur = new Pies0();
        Pies0 jamnik = new Pies0();

        jamnik.setName("Szarik");
        wilczur.setName("Azur");

        System.out.println("Imiona psow :" + jamnik.getName() + "\n" + wilczur.getName());

        jamnik.spaceruj();
        wilczur.spaceruj();
        jamnik.jedz();
        wilczur.jedz();

        Pies0 burek = new Pies0();
        Pies0 pudel;
        Pies0 husky =  new Pies0("Dominik",70.0);
        jamnik = new Pies0(20.0, "bialy");
        Pies0 wilk = new Pies0(husky);


    }
}

class Pies0 {
    private String name;
    private double energia;
    private String umaszczenie;

    public Pies0() {
        energia = 50.0;
    }

    public Pies0(Pies0 source) {
     this.umaszczenie = source.umaszczenie;
     this.energia = source.energia;
     this.name = source.name;
    }

    public Pies0(double energiaPoczatkowa) {
        this.energia = energiaPoczatkowa;
    }

    public Pies0(String name, double energia) {
        this.name = name;
        this.energia = energia;
    }

    public Pies0(double energiaPoczatkowa, String umaszczenie) {
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

