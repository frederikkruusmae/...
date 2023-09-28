//Frederik Kruusimäe
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Ulesanne6 {
    public static void main(String[] args) {
        ArrayList<Integer> arvud = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int summa = 0;

        // Täisarvude sisestamine
        while (true) {
            System.out.print("Sisesta täisarv: ");
            String sisend = scanner.nextLine();
            if (sisend.isEmpty()) {
                break;
            }

            //teisendab sisendi täisarvuks ja paneb listi. kui ei saa teisendada siis annab vea.
            try {
                int arv = Integer.parseInt(sisend);
                arvud.add(arv);
            } catch (NumberFormatException e) {
                System.out.println("Valesti sisestatud, proovi uuesti!");
            }
        }
        
        //liidab kõik sisestatud arvud kokku.
        for (int arv : arvud) {
            summa += arv;
        }
        //arvutab keskmise
        double keskmine = arvud.isEmpty() ? 0 : (double) summa / arvud.size();

        //Kirjutab kõik vajaliku mandi teksti faili, sulgeb txt faili ja annab teada et tulemused on salvestatud.
        //Kui salvestada ei saa ss toob valja vea.
        try {
            FileWriter writer = new FileWriter("tulemused6.txt");
            writer.write("Lisatud arvud: " + arvud.toString() + "\n");
            writer.write("Summa: " + summa + "\n");
            writer.write("Keskmine: " + keskmine + "\n");
            writer.close();
            System.out.println("Tulemused on salvestatud faili *tulemused6.txt*.");
        } catch (IOException e) {
            System.err.println("Viga faili salvestamisel: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
