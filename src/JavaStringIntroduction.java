import java.util.Scanner;

public class JavaStringIntroduction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length() + B.length();
        boolean result = A.compareToIgnoreCase(B) > 0;

        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0,1). toUpperCase() + B.substring(1);

        System.out.println(sum);
        System.out.println(result ? "Yes" : "No");
        System.out.println(A + " " + B);
    }
}
