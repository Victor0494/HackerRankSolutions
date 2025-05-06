package LeetCode;

import java.util.Arrays;
import java.util.Objects;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String prefix = strs[0];
        int i = 1;

        while (i != strs.length) {
            if (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            } else {
                i++;
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"a"};
        longestCommonPrefix(strs);

    }
}

//else {
//result = result.concat(String.valueOf(strs[i-1].charAt(wordIndex)));
//wordIndex++;
//i = 0;
//        }