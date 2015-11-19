package week1hw;

import java.util.Scanner;
import static java.lang.Math.*;
public class HWAd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        if (a < 0)
            a = 0;
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();
        if (b < 0)
            b = 0;
        System.out.print("Enter number c: ");
        int c = scanner.nextInt();
        if (c < 0)
            c = 0;

        a = (int)pow(a,3);
        b = (int)pow(b,3);
        c = (int)pow(c,3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
