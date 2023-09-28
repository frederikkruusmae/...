//Frederik Kruusimäe
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ulesanne7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Viga = true;
        
        //Küsib kasutajalt kahte arvu, kui sisestatud arvud on ARVUD siis prinditakse välja tulemused.
        //Kui paned arvude asemel nt tähed siis kood püüab selle kinni ning annab sulle vea.
        while (Viga) {
            try {
                System.out.print("Sisesta esimene arv: ");
                int esimeneArv = scanner.nextInt();
                
                System.out.print("Sisesta teine arv: ");
                int teineArv = scanner.nextInt();
                
                int tulemus = esimeneArv + teineArv;
                System.out.println("Arvude summa on: " + tulemus);
                
                Viga = false;
            } catch (InputMismatchException e) {
                System.out.println("Viga: Sisestage palun ainult arvud!");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}
