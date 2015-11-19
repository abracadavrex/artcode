package week1hw;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first  number: ");
        int numA = scanner.nextInt();
        System.out.print("Enter second number: ");
        int numB = scanner.nextInt();

        if (numA % 10 == numB % 10){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
