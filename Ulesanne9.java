import java.util.Date;

// Mootorratta klass
class Mootorratas {
    private String mark;
    private int aasta;
    private String värv;

    public Mootorratas(String mark, int aasta, String värv) {
        this.mark = mark;
        this.aasta = aasta;
        this.värv = värv;
    }

    public String getMark() {
        return mark;
    }

    public int getAasta() {
        return aasta;
    }

    public String getVärv() {
        return värv;
    }
}

// Sõitja klass
class Sõitja {
    private String nimi;
    private int vanus;

    public Sõitja(String nimi, int vanus) {
        this.nimi = nimi;
        this.vanus = vanus;
    }

    public String getNimi() {
        return nimi;
    }

    public int getVanus() {
        return vanus;
    }
}

// Treeningraja klass
class Treeningrada {
    private String nimi;
    private String asukoht;
    private int rajaPikkus;

    public Treeningrada(String nimi, String asukoht, int rajaPikkus) {
        this.nimi = nimi;
        this.asukoht = asukoht;
        this.rajaPikkus = rajaPikkus;
    }

    public String getNimi() {
        return nimi;
    }

    public String getAsukoht() {
        return asukoht;
    }

    public int getRajaPikkus() {
        return rajaPikkus;
    }
}

// Mootorratta treeningu klass
class MootorrattaTreening {
    private Sõitja sõitja;
    private Mootorratas mootorratas;
    private Treeningrada rada;
    private Date treeninguKuupäev;

    public MootorrattaTreening(Sõitja sõitja, Mootorratas mootorratas, Treeningrada rada, Date treeninguKuupäev) {
        this.sõitja = sõitja;
        this.mootorratas = mootorratas;
        this.rada = rada;
        this.treeninguKuupäev = treeninguKuupäev;
    }

    public Sõitja getSõitja() {
        return sõitja;
    }

    public Mootorratas getMootorratas() {
        return mootorratas;
    }

    public Treeningrada getRada() {
        return rada;
    }

    public Date getTreeninguKuupäev() {
        return treeninguKuupäev;
    }
}

public class Ulesanne9 {
    public static void main(String[] args) {
        // Loome mootorrattad
        Mootorratas ratas1 = new Mootorratas("Honda", 2022, "Punane");
        Mootorratas ratas2 = new Mootorratas("Yamaha", 2023, "Sinine");

        // Loome sõitjad
        Sõitja sõitja1 = new Sõitja("Alice", 25);
        Sõitja sõitja2 = new Sõitja("Bob", 30);

        // Loome treeningradad
        Treeningrada rada1 = new Treeningrada("Rada A", "Asukoht X", 2000);
        Treeningrada rada2 = new Treeningrada("Rada B", "Asukoht Y", 1500);

        // Loome mootorratta treeningud
        MootorrattaTreening treening1 = new MootorrattaTreening(sõitja1, ratas1, rada1, new Date());
        MootorrattaTreening treening2 = new MootorrattaTreening(sõitja2, ratas2, rada2, new Date());

        // Näidete väljatrükk
        System.out.println("Treening 1:");
        System.out.println("Sõitja: " + treening1.getSõitja().getNimi());
        System.out.println("Mootorratas: " + treening1.getMootorratas().getMark());
        System.out.println("Treeningraja nimi: " + treening1.getRada().getNimi());
        System.out.println("Treeningu kuupäev: " + treening1.getTreeninguKuupäev());

        System.out.println("\nTreening 2:");
        System.out.println("Sõitja: " + treening2.getSõitja().getNimi());
        System.out.println("Mootorratas: " + treening2.getMootorratas().getMark());
        System.out.println("Treeningraja nimi: " + treening2.getRada().getNimi());
        System.out.println("Treeningu kuupäev: " + treening2.getTreeninguKuupäev());
    }
}
