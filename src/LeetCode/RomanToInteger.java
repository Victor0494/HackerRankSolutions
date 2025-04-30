package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Integer result =0;
        Map<String, Integer> romanMap = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );

        for (int i = 0; i < s.length(); i++) {
            String current = String.valueOf(s.charAt(i));
            int currentVal = romanMap.get(current);
            if (i < s.length() - 1) {
                String next = String.valueOf(s.charAt(i + 1));
                int nextVal = romanMap.get(next);

                if (currentVal < nextVal) {
                    result -= currentVal;
                    continue;
                }
            }

            result += currentVal;
        }

        return result;
    }

    public static void main(String[] args) {
        romanToInt("IV");
    }
}
