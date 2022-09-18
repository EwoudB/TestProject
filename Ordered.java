import java.util.Scanner;

public class Ordered {
    public static void main(String[] args) {
        Scanner vraag = new Scanner(System.in);
        int num1,num2,num3;
        num1 = vraag.nextInt();
        num2 = vraag.nextInt();
        num3 = vraag.nextInt();

        //System.out.println(num1 + " " + num2 + " " + num3);
        //boolean geeft altijd true of false terug, en met een conditie er bij kun je aangeven wanneer die true of false teruggeeft
       boolean b1 = (num1 < num2) && (num2 < num3);
       boolean b2 = (num1 > num2) && (num2 > num3);
       boolean b3 = b1 || b2;
       System.out.println(b3);

       /*
       boolean b2 = (num2 < num3);
       boolean b3 = (b1 == true && b2 == true)
       System.out.println(b);
        */

    }
}
