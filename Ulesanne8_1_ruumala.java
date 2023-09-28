//Frederik Kruusimäe
public class Ulesanne8_1_ruumala {
	//arvutab rööpküliku ruumala
	public static double RoopkylikV(String u, String h) {
		float ppindala = Float.parseFloat(u);
		float korgus = Float.parseFloat(h);
		double v = ppindala * korgus;
		return v;
	}
	//arvutab kuubi ruumala
	public static double KuupV(String a) {
		float alus = Float.parseFloat(a);
		double v = alus * alus * alus;
		return v;
	}
	//arvutab risttahuka ruumala
	public static double RisttahukasV(String a, String h, String c) {
		float alus = Float.parseFloat(a);
		float korgus = Float.parseFloat(h);
        float laius = Float.parseFloat(c);
		double v = alus * korgus * laius;
		return v;
	}

}
