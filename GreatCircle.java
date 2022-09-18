import java.util.Scanner;
import java.lang.Math;

public class GreatCircle {
    public static void main(String[] args) {
        Scanner vraag = new Scanner(System.in);
        double x1,y1,x2,y2;
        double distance;
        double ymin;
        //System.out.println((Math.sin(2.123) * 8));

        x1 = vraag.nextDouble();
        y1 = vraag.nextDouble();
        x2 = vraag.nextDouble();
        y2 = vraag.nextDouble();

        y2 = Math.toRadians(y2);
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);

        //System.out.println(x1);

        ymin = y1 - y2;

        //System.out.println(ymin);

        distance = 60 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(ymin));
        System.out.println(Math.toDegrees(distance));
    }
}
