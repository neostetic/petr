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
                break;
            case "o":
                System.out.println(a - b);
                break;
            case "n":
                System.out.println(a * b);
                break;
            case "d":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Undefined");
                break;
        }
    }

}
