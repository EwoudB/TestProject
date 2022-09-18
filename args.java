public class args {
    public static void main(String[] args) {
        //string werkt niet als in de main een int[] staat.
        //String a = args[0];
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a + b);
    }
}
