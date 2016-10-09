package k2week1;

/**
 * Created by pc on 09.10.2016.
 */

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = sc.nextInt();

        System.out.print("Input second number: ");
        int b = sc.nextInt();

        System.out.print("Input third number: ");
        int c = sc.nextInt();

        if (b < a) a = b;
        if (c < a) a = c;

        System.out.println("Minimal number: " + a);

    }
}
