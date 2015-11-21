package week1hw;

import java.util.Scanner;

public class HWAd10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of day (1-7): ");
        byte day = scanner.nextByte();

        if (day < 1 || day > 7){
            System.out.println("Invalid day.");
        } else {
            System.out.print("Enter cost per minute: ");
            double tarif = scanner.nextDouble();

            if (tarif < 0){
                System.out.println("Wrong cost.");
            } else {
                System.out.print("Enter minutes: ");
                int min = scanner.nextInt();

                if (min < 0) {
                    System.out.println("Error.");
                } else {
                    if (day == 6 || day == 7){
                        tarif = tarif - tarif * 0.2;
                    }
                    System.out.println("$ " + tarif * min);
                    }
                }
            }
        }
    }

