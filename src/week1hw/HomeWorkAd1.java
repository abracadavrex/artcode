package week1hw;

import java.util.Scanner;

/**
 *
 */
public class HomeWorkAd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int num = scanner.nextInt();
        System.out.print("Your number in binary: " + Integer.toBinaryString(num));

    }
}
