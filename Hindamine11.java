//Frederik Kruusimäe

public class Hindamine11 {
    public static void main(String[] args) {
        //Loob arvud 1-66
        for (int i = 1; i <= 66; i++) {
            //Kontrollib kas arv jagub kolmega
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}