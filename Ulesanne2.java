//Frederik Kruusimäe
public class Ulesanne2 {
    //põhiprogramm
    public static void main(String[] args) {
    teisendamine(2.0f);
    ellips(3, 14);;
    teisendamine2(200);
    float s1 = kiirus(100, 1);
    float s2 = kiirus(90, 1);
    System.out.println(vahe(s1, s2));
}

//tollid meetriteks (alamprog)
static void teisendamine(float a){

float m;
    m = a*0.0254f;
System.out.println(m + " meetrit");
}

//ellips (alamprog)
static void ellips(float A, float B){ 

float pi = 3.14f;
float ellips = pi * A * B;

System.out.println("ellips S ="+ellips);
System.out.println(" ");
}

//minutid tundideks ja minutiteks (alamprog)
static void teisendamine2(float minutid){

int tund = 60;
float minut = minutid / tund;

System.out.println("tunnid = "+minut);
}

//kahe sportlase kiirus (alamprog)
static float kiirus(float D, float A){
float speed = D / A;
return speed;

}

//kahe sportlase kiiruse vahe (alamprog)
static float vahe(float s1, float s2){
float vastus = (Math.abs(s1 - s2));
return vastus;
}
}