//Frederik Kruusimäe

import java.util.Scanner;

public class Hindamine19 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

//Küsib kasutajalt kümnendsüsteemi arvu
System.out.print("Sisesta kümnendsüsteemi arv: ");
int kymnend = scanner.nextInt();
scanner.close();

//väljastab teisenduse
String kahend = teisendus(kymnend);
System.out.println("Kahendsüsteemi teisendus: " + kahend);
}

//alamprogramm
public static String teisendus(int kymnend) {
if (kymnend == 0) {
return "0";
}

//arvutussed
StringBuilder kahend = new StringBuilder();
 while (kymnend > 0) {
int remainder = kymnend % 2;
kahend.insert(0, remainder);
kymnend /= 2;
}

return kahend.toString();
}
}
