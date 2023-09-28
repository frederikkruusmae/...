//Frederik Kruusimäe
public class Ulesanne4 {

    //annab alguses väärtused ja siis prindib töödeldud sõnad välja.
    public static void main(String[] args) {
        String tekst = "Lorem iPsum";
        String[] sonadearv = tekst.split(" ");

        System.out.println("Muudab teksti tähed suureks: " + tekst.toUpperCase());
        System.out.println("Teksti märkide arv: " + tekst.length());
        System.out.println("Teksti sõnade arv: " + sonadearv.length);
        System.out.printf("Ma ei tea mis %s tähendab", sonadearv[0]);
    }
}