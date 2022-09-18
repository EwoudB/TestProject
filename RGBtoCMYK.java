import java.util.Scanner;
import java.lang.Math;

public class RGBtoCMYK {
    public static void main(String[] args) {
        // rgb = red green blue
        // cmyk = cyan magenta yellow black
        Scanner vraag = new Scanner(System.in);
        float red1,green1,blue1,red,green,blue,cyan,magenta,yellow,black,white;

        red1 = vraag.nextInt();
        green1 = vraag.nextInt();
        blue1 = vraag.nextInt();

        System.out.println("red = " + red1);    System.out.println("green = " + green1);    System.out.println("blue = " + blue1);

        //rgb value aanmaken
        red = red1/255; green = green1/255; blue = blue1/255;
        //System.out.println(blue);

        white = Math.max(red, Math.max(green, blue));
        //System.out.println("tussenstop = " + tussenstop);

        black = 1-white;

        //berekening voor CMYK
        cyan = (white-red)/white; magenta = (white-green)/white; yellow = (white-blue)/white;

        //print voor alle kleuren
        System.out.println("cyan = " + cyan);       System.out.println("magenta = " + magenta);
        System.out.println("yellow = " + yellow);   System.out.println("black = " + black);
        System.out.println("white = " + white);
    }
}
