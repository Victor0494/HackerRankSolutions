package HackerRank;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
// Categoria: Warmup
// Linguagem: Java

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(count + " " + line);
            count++;
        }
    }
}
