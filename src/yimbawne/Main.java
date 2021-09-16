package yimbawne;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        /*
            Scanner sc = new Scanner(System.in);
            String O = sc.nextLine();
        */

        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        switch (args[0].toLowerCase(Locale.ROOT)) {
            case "s":
                System.out.println(a + b);
                return;
            case "o":
                System.out.println(a - b);
                return;
            case "n":
                System.out.println(a * b);
                return;
            case "d":
                System.out.println(a / b);
                return;
            default:
                System.out.println("Undefined");
                return;
        }
    }

}
