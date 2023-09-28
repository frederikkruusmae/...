//Frederik Kruusimäe
import java.util.Scanner;

//Põhiprogramm
public class Ulesanne5 {
    public static void main(String[] args) {
        matem();
    }
    
    //alamprogramm (Alguses lubab jagamist teha ainult 3 korda ja küsib kasutajalt esimest ja teist nr millegi tehe teha.)
    public static void matem() {
        Scanner Scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Sisesta esimene number: ");
            double nr1 = Scanner.nextDouble();
            System.out.println("Sisesta teine nr: ");
            double nr2 = Scanner.nextDouble();

            //Laseb esimesele nr panna arvu 0 aga jagajale mitte. Lõpuks annab vastuse.
            if (nr1 <= -1 || nr2 <= 0) {
                System.out.println("Proovi uuesti!");
                System.exit(0);
            }
            System.out.println("Arvude jagatis on: " + nr1 / nr2);
        }
        Scanner.close();
    }
}
