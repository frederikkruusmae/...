//Frederik Kruusimäe

import java.util.Random;
import java.util.Scanner;

public class Hindamine23 {
    public static void main(String[] args) {
    taring();
    }

    public static void taring(){
        Random rand = new Random(); 
        Scanner scanner = new Scanner(System.in);

        //mangija ja arvuti skoor
        int pwin = 0;
        int cwin = 0;
        boolean mangime = false;

        System.out.println("Soovid mängida täringuid arvuti vastu? (jah/ei): ");

        //Kui vastus on ja siis hakkab mäng tööle. Kui vastus on ei, siis läheb mäng kinni
        if (scanner.nextLine().equals("jah")){
            System.out.println("Arvuti: Tsau, mina olen Arvuti ja nüüd hakkame täringuid mängima");
            mangime = true;
        } else {
            System.out.println("Arvuti: Hea küll, moni teine kord siis.");
        }
        
        //Kui veeretad, siis genereeritakse arvutile ja mängijale random number
        while (mangime){
            System.out.println("Arvuti: veeretad? (jah/ei)");

            if (scanner.nextLine().equals("jah")) {
                System.out.println("----------------------------------------------------");
                int pscore = rand.nextInt(6)+1; 
                int cscore = rand.nextInt(6)+1;

                System.out.println("Arvuti: Ma veeretasin: "+ cscore +" ja sina veeretasid: "+ pscore);

                //mangija skoor on suurem kui arvuti oma
                if (pscore > cscore) {
                    System.out.println("Arvuti: Tubli, sinu veeretatud number oli suurem.");
                    pwin += 1;
                
                //mangija skoor on vaiksem kui arvuti oma
                } else if(pscore < cscore) {
                    System.out.println("Arvuti: Seekord oli minu number suurem.");
                    cwin += 1;

                //viik
                } else {
                    System.out.println("Arvuti: Tohohh, viik!");
                    cwin += 0;
                }

                System.out.println("Arvuti voidud:" + cwin +" Mängija voidud: "+ pwin);
                System.out.println("------------------------------------------------------------------------");
            } else {
                System.out.println("Arvuti: Heaküll, tsaukitsau.");
                mangime = false;
            }
        }
    scanner.close();
    }
}