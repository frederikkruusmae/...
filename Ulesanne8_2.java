//Frederik Kruusimäe
public class Ulesanne8_2 {

	public static void main(String[] args) {
		//annab karu teemale vaartused ja kutsub nad teisest failist valja
		Ulesanne8_2_karu loom1 = new Ulesanne8_2_karu(1, "Alfred ", 3 );
		loom1.vanus();
		loom1.nimi();
		loom1.pikkus();
		//annab siili teemale vaartused ja kutsub nad teisest failist valja
		Ulesanne8_2_siil loom2 = new Ulesanne8_2_siil(1, "Tilberdis", 10);
		loom2.vanus();
		loom2.nimi();
		loom2.pikkus();
	}

}
