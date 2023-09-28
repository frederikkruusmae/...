//Frederik Kruusimäe
public class Ulesanne3 {
    
//annab ette raigelt numbreid ja siis hakkab väljastama asju mida Ülesandes vaja väljastada oli.
public static void main(String[] args) {
int[] nr = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1};

System.out.println("Esimese elemendi väärtus: " + nr[0]);
System.out.println("Viimase elemendi väärtus: " + nr[35]);
System.out.println("Kõik numbrid kokku: " + nr.length);

//Mario ma tean, et kui ma poleks seda kommenteerinud siis sa oleks taidlema hakanud:D
//Väljastab arvude kogu summa
int summa = 0;
for (int i = 0; i < nr.length; i++) {
summa += nr [i];
}
System.out.println("Kogu summa: " + summa);
System.out.println("Elementide keskmine: " + (float) summa / nr.length);


//Mitmemõõteline masiiv, mis annab ette kuupäevad ja temperatuurid
int[][] data = {
    {1,23},{2,15},{3,29},{4,15},{5,26},{6,17},{7,26},{8,15},{9,28},{10,12},
    {11,24},{12,16},{13,21},{14,10},{15,10},{16,26},{17,27},{18,19},{19,14},
    {20,14},{21,14},{22,26},{23,20},{24,28},{25,29},{26,11},{27,28},{28,19},
    {29,25},{30,12}
};

//Toob välja masiivist ainult temperatuurid
System.out.println("Temperatuurid: ");
for (int i = 0; i < data.length; i++) {
    System.out.print(" "+data[i][1]);
}
}



}
