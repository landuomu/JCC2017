import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double surfaceArea = 4 * Math.PI * Math.pow(radius,2);
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(radius,3);
        System.out.println("Surface area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}
