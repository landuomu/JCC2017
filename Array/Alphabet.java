import java.util.Scanner;
import java.util.ArrayList;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        // initialise array of alphabets in alphabetical order
        ArrayList<Character> alphabets = new ArrayList<Character>();
        for (char c = 'a'; c <= 'z'; c++)
            alphabets.add(c);

        // remove alphabets which occurs in sentence
        char[] arr = sentence.toLowerCase().toCharArray();
        for (char c : arr)
            if (Character.isAlphabetic(c))
                // remove by value (Character) in ArrayList
                // should not remove by index (int) as it will change as we remove elements in alphabets
                alphabets.remove(new Character(c));

        // print remaining alphabets
        for (char c: alphabets)
            System.out.print(c + " ");
        System.out.println();
    }
}
