//Frederik Kruusimäe
public class Ulesanne8_1_pindalad {
	//arvutab rööpküliku pindala
	public static double roopkylikS(String a, String h) {
		float alus = Float.parseFloat(a);
		float korgus = Float.parseFloat(h);
		double s = alus * korgus;
		return s;
	}
	//arvutab ristküliku pindala
	public static double ristkylikS(String a, String h) {
		float laius = Float.parseFloat(a);
		float pikkus = Float.parseFloat(h);
		double s = pikkus * laius;
		return s;
	}
	//arvutab kolmnurga pindala
	public static double kolmnurkS(String a, String h) {
		float alus = Float.parseFloat(a);
		float korgus = Float.parseFloat(h);
		double s = alus * korgus/2;
		return s;
	}

}
