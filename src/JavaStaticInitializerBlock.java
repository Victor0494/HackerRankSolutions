import java.util.Scanner;

public class JavaStaticInitializerBlock {

    public static int valueB;
    public static int valueH;


    static {
        Scanner sc = new Scanner(System.in);

        valueB = sc.nextInt();
        valueH = sc.nextInt();
    }

    public static void main(String[] args) throws Exception {


        if(valueB <= 0 || valueH <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return;
        }
        System.out.println(valueB * valueH);

    }
}
