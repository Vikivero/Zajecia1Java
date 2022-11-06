package com.powtorka;

class Main1 {
    public static void main(String[] args) {
//        Pies wilczur = new Pies();
//        Kot karri = new Kot();
//        Jamnik lulu = new Jamnik("canis");
//
//
//        karri.ileEnergii();
//        wilczur.spaceruj();
//        lulu.getUmaszczenie();
//
//
//        karri.mow();
//        wilczur.mow();
        Pies huski = new Pies();
        Pies wilczur = new Pies();
        Pies mops = new Pies();

        Kot leo = new Kot();
        Kot Duo = new Kot();
        Kot.jakiGlos();
        Pies.jakiGlos();

        System.out.println(Pies.liczbaOsobnikow);
        System.out.println(Kot.liczbaOsobnikow);

    }
}

public abstract class Ssak {

    private String name;
    private double energia;
    private String umaszczenie;
    private int kodChip;

    public Ssak() {
        energia = 50.0;
    }

    public Ssak(com.powtorka.Ssak source) {
        this.umaszczenie = source.umaszczenie;
        this.energia = source.energia;
        this.name = source.name;
    }

    public Ssak(double energiaPoczatkowa) {
        this.energia = energiaPoczatkowa;
    }

    public Ssak(String name, double energia) {
        this.name = name;
        this.energia = energia;
    }

    public Ssak(double energiaPoczatkowa, String umaszczenie) {
        this.energia = energiaPoczatkowa;
        this.umaszczenie = umaszczenie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKodChip() {
        return kodChip;
    }

    public void setKodChip(int kodChip) {
        this.kodChip = kodChip;
    }

    public String getUmaszczenie() {
        return umaszczenie;
    }

    public void setUmaszczenie(String umaszczenie) {
        this.umaszczenie = umaszczenie;
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

    public abstract void mow();

    public abstract void chipowanie();


}

class Pies extends Ssak {
    public double energia;
    static int liczbaOsobnikow = 0;

    public Pies() {
        liczbaOsobnikow++;
    }

    public Pies(double energia) {
        this.energia = energia;
        liczbaOsobnikow++;
    }

    public void mow() {
        System.out.println(this.getName() + " hau");
    }

    public static void jakiGlos() {
        System.out.println(" Pies  mowi  hau");
    }

    @Override
    public void chipowanie() {
        if (getKodChip() == 0 && getName() != null && getUmaszczenie() != null ) {
            setKodChip(hashCode());
        }
    }
}

class Kot extends Ssak {
    public double energia;
    static int liczbaOsobnikow = 0;

    public Kot() {
        liczbaOsobnikow++;
    }

    public Kot(double energia) {
        this.energia = energia;
        liczbaOsobnikow++;
    }

    public void mow() {
        System.out.println(this.getName() + " miau");
    }

    public static void jakiGlos() {
        System.out.println(" Kot mowi  miau");
    }

    @Override
    public void chipowanie() {
        if (getKodChip() == 0 && getName() != null && getUmaszczenie() != null ) {
            setKodChip(hashCode());
        }
    }
}


class Jamnik extends Pies {
    private String nazwaLacinska;

    public Jamnik(String nazwaLacinska) {
        this.nazwaLacinska = nazwaLacinska;
    }

    public Jamnik(double energia, String nazwaLacinska) {
        super(energia);
        this.nazwaLacinska = nazwaLacinska;
    }

    @Override
    public void mow() {
        super.mow();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getUmaszczenie() {
        return super.getUmaszczenie();
    }

}