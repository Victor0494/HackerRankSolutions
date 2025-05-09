package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if(s.length() == 1) return false;

        Map<Character, Character> values = new HashMap<>();
        values.put('(', ')');
        values.put('{', '}');
        values.put('[', ']');
        Stack<Character> myStack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(values.containsKey(current)) {
                myStack.push(current);
            } else if (myStack.isEmpty() || values.get(myStack.pop()) != current) {
                return false;
            }
        }
        return myStack.isEmpty();
    }

    public static void main(String[] args) {
        isValid("(])");
    }
}