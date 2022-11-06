public class zadanie2 {
    public static void main(String[] args) {
//        Ssak Krolik = new Ssak("Maru",20.0,"rudy");
        Pies Labrador = new Pies("Lulu", 30.8, "szary");
        Kot Pantera = new Kot("Rubi", 21.0, "bialy");

//        Ssak krowa = new Ssak("Mimi",60.0,"czarna");
        Pies Mops = new Pies("Krol", 35.8, "brazowy");
        Kot Kitty = new Kot("Karri", 23.0, "niebeski");

//        Krolik.Mow();
        Labrador.Mow();
        Pantera.Mow();
        Labrador.Chipowanie();
        System.out.println(Labrador.kod_chip);

        Labrador.spaceruj("miasto");
        Pantera.spaceruj("Park");
//        Krolik.spaceruj("park");

        PiesRasowy Jamnik = new PiesRasowy("Dada","Ruda");
        KotRasowy Tigr = new KotRasowy("Naza","fioletowa");
        Jamnik.Dane();
        Tigr.Dane();

    }
}

abstract class Ssak {
    public String name;

    public double energia_poczatkowa;

    public String umaszczenie;

    int kod_chip = -1;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Ssak() {
    }

    public Ssak(String name) {
        this.name = name;
    }

    public Ssak(String name, double energia_poczatkowa, String umaszczenie) {
        this.name = name;
        this.umaszczenie = umaszczenie;
        this.energia_poczatkowa = energia_poczatkowa;
    }

    public void spaceruj(String mejsceSpaceru) {
        System.out.println(this.name + " teraz spaceruje w  " + mejsceSpaceru);
    }

    public void jedz() {
        System.out.println(this.name + " teraz je");
    }

    abstract public void Mow();

    abstract public void Chipowanie();

}

class Pies extends Ssak {
    public double energia_poczatkowa;

    public Pies(String name, String umaszenie) {
    }

    Pies(String name) {
        super(name);
    }

    Pies(String name, double energia_poczatkowa, String umaszczenie) {
        super(name, energia_poczatkowa, umaszczenie);
    }

    public void Mow() {
        System.out.println(this.name + " Hau");
    }

    public void Chipowanie() {
        if (kod_chip > 0 && this.name != null && umaszczenie != null) {
           System.out.println(this.name + " Jest zachipowane,nie mozna drugi raz zachipowac!");
        } else {
            System.out.println(this.name + " Zostaw  zachipowany");
        this.kod_chip = this.hashCode();}
    }
}

class Kot extends Ssak {
    public double energia_poczatkowa;

    public Kot(String name, String umaszenie) {
    }

    Kot(String name, double energia_poczatkowa, String umaszczenie) {
        super(name, energia_poczatkowa, umaszczenie);
    }

    public void Mow() {
        System.out.println(this.name + " Miau");
    }

    public void Chipowanie() {
        if (kod_chip > 0 && this.name != null && umaszczenie != null) {
           // System.out.println(this.name + " Jest zachipowane");
        }else {
            System.out.println(this.name + " Zostaw  zachipowany");
            this.kod_chip = this.hashCode();
        }
    }
}

class KotRasowy extends Kot {
    String nazwa_lacinska;

    KotRasowy (String name, String umaszenie) {
        super(name,umaszenie);
    }
    public void Dane () {
        super.Chipowanie();
        super.spaceruj( "park");
        super.Mow();
    }
}

class PiesRasowy extends Pies {
    String nazwa_lacinska;
    PiesRasowy (String name, String umaszenie) {
        super(name,umaszenie);
    }

    public void Dane () {
        super.Chipowanie();
        super.spaceruj("park");
    }
}
