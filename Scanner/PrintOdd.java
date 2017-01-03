import java.util.Scanner;

public class PrintOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Enter an integer greater than 1");
            return;
        }

        for (int i=1;i<=n;i+=2)
            System.out.print(i + " ");
        System.out.println();
    }
}
