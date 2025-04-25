package HackerRank;

import java.util.Scanner;

public class JavaIntToString {

    public static void main(String[] args) {

//        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below

            if(n >= -100 && n <= 100) {
                String s = Integer.toString(n);

                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                    System.out.println("Wrong answer.");
                }
            } else {
                throw new  Exception();
            }
        } catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }


}
