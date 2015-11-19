package week1hw;

import java.util.Scanner;

public class HomeWorkAd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int fac = 1;
        for(int i=1; i <= num; i++){
            fac = i * fac;
        }
        System.out.println("Result = " + fac);
    }
}
