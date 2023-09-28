//Frederik Kruusimäe
public class Ulesanne8_2_siil {
//isendimuutujad
	public int vanus;
	public String nimi;
	public int pikkus;


	//konstruktor
	public Ulesanne8_2_siil(int vanus, String nimi, int pikkus) {
		this.vanus = vanus;
		this.nimi = nimi;
        this.pikkus = pikkus;
	}
	
	
	//isendimeetodid
    public void vanus() {
        System.out.println("ssss sssssss ss ss sssssssss " +vanus );
    }
    public void nimi() {
        System.out.println("sss sssssssss s s s " +nimi+ "ssssss ss ssssss");
    }
	public void pikkus() {
		System.out.println("sss sss sss sss sssss " +pikkus+ " s s s s s");
	}
}