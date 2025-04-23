import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaSubStringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> subStrings = new ArrayList<>();

        for(int i = 0; i <= s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {
                if(s.substring(i,j).length() == k) {
                    subStrings.add(s.substring(i, j));
                }
            }
        }

        List<String> stringList = subStrings.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        smallest = stringList.get(0);
        largest = stringList.get(stringList.size() - 1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
