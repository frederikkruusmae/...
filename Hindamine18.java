//Frederik Kruusimäe

public class Hindamine18 {
    public static void main(String[] args) {
        //suvalised ette antud arvud
        int[] arvud = {7, 3, 6, 4, 5, 9, 7, 8, 4, };

        //Vaatab arvud üle, ning prindib loendist välja ainult paaritud arvud.
        System.out.println("Paaritud arvud:");
        for (int arv : arvud) {
            if (arv % 2 != 0) {
                System.out.println(arv);
            }
        }
    }
}
