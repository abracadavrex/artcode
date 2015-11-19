package week1hw;

import java.util.Scanner;

public class HWAd3 {
    public static void main(String[] args) {
        System.out.print("Enter 3-digit number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 100){
            System.out.println("Error: not enough digits. Exiting...");
        }
        else {
            int a = num / 100;
            int b = (num % 100) / 10;
            int c = num % 10;

            if (a == b && b == c) {
                System.out.println("All digits are equial.");
            } else if (a == b || b == c || a == c) {
                System.out.println("This number consist equial digits.");
            } else System.out.println("This number doesn't consist equial digits.");
        }
    }
}
