package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> stringList = backTracking(new ArrayList<>(), 0, 0, "", n);
        stringList
                .forEach(System.out::println);
        return stringList;
    }

    private static List<String> backTracking(List<String> result, Integer open, Integer close, String word, Integer n) {
        if(word.length() == n*2) {
            result.add(word);
        }

        if(open < n) {
            backTracking(result, open+1, close, word + "(", n);
        }

        if(close < open) {
            backTracking(result, open, close+1, word + ")", n);
        }

        return result;
    }


    public static void main(String[] args) {
        generateParenthesis(3);
    }

}
