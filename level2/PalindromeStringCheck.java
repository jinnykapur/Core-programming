/*
Program to Check Palindrome String
Problem Statement: Create a PalindromeChecker class with an attribute text. 
Add methods to:
1. Check if the text is a palindrome.
2. Display the result.

Explanation: The PalindromeChecker class holds the text attribute. 
The methods operate on this attribute to verify its palindrome status and display the result.
*/

import java.util.*;

public class PalindromeStringCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();
    }
    static class PalindromeChecker{
        private String text;

        public PalindromeChecker(String text){
            this.text=text;
        }

        public boolean isPalindrome(){
            String cleanedText = text.replaceAll("\\s"," ").toLowerCase();
            int left=0, right=cleanedText.length()-1;

            while(left<right){
                if(cleanedText.charAt(left)!=cleanedText.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a palindrome.");
        }
    }
    }
}