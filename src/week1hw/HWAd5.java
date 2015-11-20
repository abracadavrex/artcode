package week1hw;

import java.util.Scanner;

public class HWAd5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        if (a == b || b == c || a == c){
            if (a == b && b == c && a == c){
                System.out.println("a = b = c");
            } else if (a == b) {
                System.out.println("a = b");
            } else if (b == c){
                System.out.println("b = c");
            } else if (a == c){
                System.out.println("a = c");
            } else System.out.println("b = c");
        } else System.out.println("Not consist equial numbers.");
    }
}
