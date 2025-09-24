package Day8ProblemStatement.Strings;

public class Q12ReplaceWordInSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String oldWord = "fun";
        String newWord = "powerful";

        String result = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
        System.out.println("Modified Sentence: " + result);
    }
}
