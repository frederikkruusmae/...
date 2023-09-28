//Frederik Kruusimäe

public class Hindamine12 {
    public static void main(String[] args) {

        System.out.println("Kujund A");
        
        //Kujund A (Teeb kujundi valmis ette antud tärnide kogustega ühes reas.)
        int[] tarneperrida = {1, 3, 5, 3, 1};
        for (int i = 0; i < tarneperrida.length; i++) { 
        for (int j = 0; j < tarneperrida[i]; j++) {         
        System.out.print("*"); }                                  
        System.out.println(); }                                     

        System.out.println("Kujund B");
        
        //Kujund B
        for (int i = 1; i < 6; i++) {                    
        for (int j = 0; j < 6-i; j++) {                        
        System.out.print("*");}                                  
        System.out.println();}                                 
        
        System.out.println("Kujund C");
        
        //Kujund C
        for (int i = 1; i < 6; i++) {
        for (int j = 0; j < i; j++) {
        System.out.print("*");}
        System.out.println("");}
        
        System.out.println("Kujund D");
        
        //Kujund D (Teeb alguses Kujundi B ja siis C. Tänu nende kokku panemisele näeb see välja nagu kujund D)
        for (int i = 1; i < 6; i++) {                               
        for (int j = 0; j < 6-i; j++) {
        System.out.print("*");}
        System.out.println();}  

        for (int i = 1; i < 6; i++) {                               
        for (int j = 0; j < i; j++) {
        System.out.print("*");}                                    
        System.out.println("");}
        
    }
}

