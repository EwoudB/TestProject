import java.util.Scanner;

public class HiFour {
    public static void main(String[] args) {
        //variabelen aanwijzen
        String naam1,naam2,naam3,naam4;
        Scanner vraag = new Scanner(System.in);
        //namen opvragen
        System.out.print("Naam: ");
        naam1 = vraag.next();
        //System.out.print("Naam2: ");
        naam2 = vraag.next();
        //System.out.print("Naam3: ");
        naam3 = vraag.next();
        //System.out.print("Naam4: ");
        //als hier nextLine komt te staan ipv Next dan slaat die de laatste over
        naam4 = vraag.next();
        //namen print
        System.out.println("Hey " + naam4 + " , " + naam3 + " , " + naam2 + " and " + naam1);
    }
}
