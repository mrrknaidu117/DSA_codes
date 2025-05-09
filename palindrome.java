import java.util.Scanner;
public class PalindromeChecker {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter a string to check if it's a palindrome:");
 String input = scanner.nextLine();
 // Remove spaces and convert to lowercase for case-insensitive comparison
 String cleanedInput = input.replaceAll("\\s", "").toLowerCase();
 boolean isPalindrome = isPalindrome(cleanedInput);
 if (isPalindrome) {
 System.out.println(input + " is a palindrome.");
 } else {
 System.out.println(input + " is not a palindrome.");
 }
 scanner.close();
 }
 public static boolean isPalindrome(String str) {
 int left = 0;
 int right = str.length() - 1;
 while (left < right) {
 if (str.charAt(left) != str.charAt(right)) {
 return false; // Characters at the current positions do not match
 }
 left++;
 right--;
 }
 return true; // All characters matched, it's a palindrome
 }
}
