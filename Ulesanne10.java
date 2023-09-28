class Loom {
    protected String nimi;

    public Loom(String nimi) {
        this.nimi = nimi;
    }

    public void haal() {
        System.out.println("Looma häälitus");
    }

    public void toit() {
        System.out.println("Loom sööb toitu");
    }
}

class Roomaja extends Loom {
    private boolean onMürk;

    public Roomaja(String nimi, boolean onMürk) {
        super(nimi);
        this.onMürk = onMürk;
    }

    @Override
    public void toit() {
        System.out.println("Roomaja toitub putukatest ja väikestest loomadest.");
    }
    
    public void kuvaaMürgisus() {
        System.out.println("Mürgine: " + onMürk);
    }
}

class Lind extends Loom {
    private int lennukaugus;

    public Lind(String nimi, int lennukaugus) {
        super(nimi);
        this.lennukaugus = lennukaugus;
    }

    public void lendamine() {
        System.out.println("Lind lendab " + lennukaugus + " meetrit.");
    }
}

class Kala extends Loom {
    private String veekeskkond;

    public Kala(String nimi, String veekeskkond) {
        super(nimi);
        this.veekeskkond = veekeskkond;
    }

    @Override
    public void toit() {
        System.out.println("Kala toitub vees leiduvatest väikestest organismidest.");
    }
    
    public void kuvaaVeekeskkond() {
        System.out.println("Elupaik: " + veekeskkond);
    }
}

class Imetaja extends Loom {
    private int jooksukiirus;

    public Imetaja(String nimi, int jooksukiirus) {
        super(nimi);
        this.jooksukiirus = jooksukiirus;
    }

    public void jooksmine() {
        System.out.println("Imetaja jookseb kiirusega " + jooksukiirus + " km/h.");
    }
}

class Koer extends Imetaja {
    private String tõug;

    public Koer(String nimi, int jooksukiirus, String tõug) {
        super(nimi, jooksukiirus);
        this.tõug = tõug;
    }

    public void haugamine() {
        System.out.println("Koer haugab.");
    }
}

public class App {
    public static void main(String[] args) {
        Roomaja madu = new Roomaja("Madu", true);
        Lind kotkas = new Lind("Kotkas", 500);
        Kala forell = new Kala("Forell", "jõgi");
        Koer labrador = new Koer("Labrador", 40, "Labradori retriiver");

        madu.haal();
        madu.toit();
        madu.kuvaaMürgisus();

        kotkas.haal();
        kotkas.lendamine();
        kotkas.toit();

        forell.haal();
        forell.kuvaaVeekeskkond();
        forell.toit();

        labrador.haal();
        labrador.jooksmine();
        labrador.haugamine();
        labrador.toit();
    }
}
