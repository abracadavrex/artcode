package week1hw;

import java.util.Scanner;

public class HWAd7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of mounth: ");
        byte mounth = scanner.nextByte();

        if (mounth < 1 || mounth > 12)
            System.out.println("Invalid number. Exiting...");
        else {
            if (mounth == 1) System.out.println("January");
            else if (mounth == 2) System.out.println("February");
            else if (mounth == 3) System.out.println("March");
            else if (mounth == 4) System.out.println("April");
            else if (mounth == 5) System.out.println("May");
            else if (mounth == 6) System.out.println("June");
            else if (mounth == 7) System.out.println("Jule");
            else if (mounth == 8) System.out.println("August");
            else if (mounth == 9) System.out.println("September");
            else if (mounth == 10) System.out.println("October");
            else if (mounth == 11) System.out.println("November");
            else System.out.println("December");
        }
    }
}
