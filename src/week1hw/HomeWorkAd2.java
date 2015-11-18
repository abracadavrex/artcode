package week1hw;

import java.util.Scanner;

/**
 * Created by pc on 18.11.2015.
 */
public class HomeWorkAd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int i, fac = 1;
        for(i=1; i <= num; i++){
            fac = i * fac;
        }
        System.out.println("Result = " + fac);
    }
}
