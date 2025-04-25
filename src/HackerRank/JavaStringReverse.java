package HackerRank;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); 
        String word=sc.next();
        boolean palindrome = true;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != word.charAt(word.length()-i-1)) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome ? "Yes": "No");
    }
}
