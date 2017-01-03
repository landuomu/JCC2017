import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Cannot divide by zero!");
            return;
        }

        double quotient = (double) dividend / (double) divisor;
        System.out.printf("%.2f\n", quotient);
    }
}
