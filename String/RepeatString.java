import java.util.Scanner;

public class RepeatString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int times = sc.nextInt();

        for (int i=0;i<times;i++)
            System.out.println(str);

        /* OR
        while (times-- > 0)
            System.out.println(str);
        */
    }
}
