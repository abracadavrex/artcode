package week1hw;

import java.util.Scanner;
import static java.lang.Math.*;

public class HWAd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a (hipotenuse): ");
        int a = scanner.nextInt();
        System.out.print("Enter side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        if (a >= b + c){
            System.out.print("Error: impossible triangle. Exiting...");
        } else {
            if (pow(a,2) == pow(b,2) + pow(c,2)){
                System.out.println("Triangle is rectangular.");
            } else {
                System.out.println("Triangle is unrectangular.");
            }
        }
    }
}
