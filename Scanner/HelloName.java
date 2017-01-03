import java.util.Scanner;

public class HelloName {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        // System.out.printf("Hello, %s\n", name);
    }
}
