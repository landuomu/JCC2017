import java.util.Scanner;

public class Palindrome {
    // Checks if str is palindrome by comparing first and last char, progressively to the middle
    public static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        for (int i=0;i<arr.length/2;i++) 
            if (arr[i] != arr[arr.length-1-i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (isPalindrome(str.toLowerCase())) System.out.println(str + " is palindrome.");
        else System.out.println(str + " is not palindrome.");
    }
}
