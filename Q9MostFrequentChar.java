package Day8ProblemStatement.Strings;
import java.util.HashMap;

public class Q9MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (char ch : freq.keySet()) {
            if (freq.get(ch) > maxCount) {
                maxCount = freq.get(ch);
                maxChar = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}
