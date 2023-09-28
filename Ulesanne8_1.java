//Frederik Kruusimäe
import java.util.Scanner;

public class Ulesanne8_1 {

	public static void main(String[] args) {
		//muutujad
        String laius = "";
        String alus = "";
        String korgus = "";
        String ppindala = "";
		String pikkus = "";
		Scanner scanner = new Scanner (System.in);
		//prindib menüü kus saad valida mida arvutada lased.
		System.out.print("Rööpküliku pindala (1) \nRistküliku pindala (2) \nKolmnurga pindala (3) \nRööpküliku ruumala (4) \nkuubi ruumala (5) \nristtahuka ruumala (6)\nVali tegevus: " ); 
		String valik = scanner.next();

        if (valik.equals("1")) {
            System.out.print("Sisesta kõrgus: ");
            korgus = scanner.next();
			System.out.print("sisesta alus");
			alus = scanner.next();
			
        } else if (valik.equals("2")) {
            System.out.print("Sisesta laius: ");
            laius = scanner.next();
            System.out.print("Sisesta pikkus: ");
            pikkus = scanner.next();

        } else if (valik.equals("3")) {
            System.out.print("Sisesta kõrgus: ");
            korgus = scanner.next();
            System.out.print("Sisesta alus: ");
            alus = scanner.next();

        } else if (valik.equals("4")) {
            System.out.print("Sisesta põhja pindala: ");
            ppindala = scanner.next();
            System.out.print("Sisesta kõrgus: ");
            korgus = scanner.next();

        } else if (valik.equals("5")) {
            System.out.print("Sisesta laius: ");
            laius = scanner.next();
		    System.out.print("Sisesta alus: ");
		    alus = scanner.next();
		    System.out.print("Sisesta kõrgus: ");
		    korgus = scanner.next();

        } else if (valik.equals("6")) {
            System.out.print("Sisesta alus: ");
            alus = scanner.next();
       
        }

		double s, v;
		switch (Integer.parseInt(valik)) {
		case 1:
			s = Ulesanne8_1_pindalad.roopkylikS(alus, korgus);
			System.out.printf("Rööpküliku pindala on %.2f ",s);
			break;
		case 2:
			s = Ulesanne8_1_pindalad.ristkylikS(laius, pikkus);
			System.out.printf("Ristküliku pindala on %.2f ",s);
			break;
		case 3:
			s = Ulesanne8_1_pindalad.kolmnurkS(alus, korgus);
			System.out.printf("Kolmnurga pindala on %.2f ",s);
			break;

        case 4:
			v = Ulesanne8_1_ruumala.RoopkylikV(ppindala, korgus);
			System.out.printf("Rööpküliku ruumala on %.2f m kuubis ",v);
			break;
		case 5:
			v = Ulesanne8_1_ruumala.KuupV(alus);
			System.out.printf("Kuubi ruumala on %.2f m kuubis ",v);
			break;
		case 6:
			v = Ulesanne8_1_ruumala.RisttahukasV(alus, korgus, laius);
			System.out.printf("Risttahuka ruumala on %.2f m kuubis ",v);
			break;

		default:
			System.out.print("Valikust arusaamine ebaõnnestus!");
			break;
		}
	scanner.close();

	}

}