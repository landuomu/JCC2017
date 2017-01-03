import java.util.Scanner;

public class OutputVowel {
    public static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }

        /* OR
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
        */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int numVowels = 0;
        for (int i=0;i<str.length();i++) {
            if (isVowel(str.toLowerCase().charAt(i))) {
                // print comma before all except first vowel
                if (numVowels++ > 0) System.out.print(",");
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}
