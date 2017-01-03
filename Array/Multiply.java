import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // initialise digits to store digits that appear/do not appear in product
        int[] digits = new int[10];
        for (int i=0;i<10;i++)
            digits[i] = i;

        // read each digit of product
        int product = a*b*c;
        while (product > 0) {
            int d = product % 10;
            digits[d] = -1; // d appears in product
            product /= 10;
        }

        // print out digits that do not appear in product
        for (int digit : digits) 
            if (digit != -1)
                System.out.print(digit + " ");
        System.out.println();
    }
}
