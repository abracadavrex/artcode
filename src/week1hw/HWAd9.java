package week1hw;

import java.util.Scanner;

/**
 * Created by pc on 20.11.2015.
 */
public class HWAd9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height: ");
        int h = scanner.nextInt();

        System.out.print("Enter weight: ");
        int w = scanner.nextInt();

        if (w <= h - 100){
            System.out.println("Normal weight.");
        } else System.out.println("Overheight. Need diet and sport.");
    }
}
