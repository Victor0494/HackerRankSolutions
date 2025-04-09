import java.math.BigInteger;
import java.util.*;

public class JavaDataTypes {

    public static void main(String[] args) {
        long number;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            String value = sc.next();
            try {
                number = Long.parseLong(value);
                System.out.println(value + " can be fitted in:");
                if (number >= -128 && number <= 127) {
                    System.out.println("* byte");
                }
                if (number >= -32768 && number <= 32767) {
                    System.out.println("* short");
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (number <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.print(value + " can't be fitted anywhere.");
                System.out.println();
            }

        }
    }
}