import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double opposite = sc.nextDouble();
        double adjacent = sc.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(opposite,2) + Math.pow(adjacent,2));
        System.out.printf("%.3f\n", hypotenuse);

        // Alternatively
        // System.out.printf("%.3f\n", Math.hypot(opposite, adjacent));
        // :P
    }
}
