import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker App - UC7");

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare first and last elements
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}