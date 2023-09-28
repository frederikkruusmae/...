public class Ulesanne8_2_karu {
	//isendimuutujad
	public String Värv;
	public String suurus;
	public String elukoht;

	//konstruktor
	public void Karu (String v, String s, String e){
		this.varv = v;
		this.suurus = s;
        this.elukoht = e;
	}
	
	public void Karu (){
		this.varv = "Karu on pruuni värvi.";
		this.suurus = "Karu on väga paks ja suur.";
        this.elukoht = "Karu elab suuuuures metsas.";
	}
	
	//isendimeetodid
	public void värv(){
		System.out.println("Karu värvus: "+varv);
	}
    public void suurus(){
        System.out.println("Karu suurus: "+suurus);
    }
    public void elukoht(){
        System.out.println("Karu elukoht: "+elukoht);
    }
}
