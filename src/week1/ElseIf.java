package week1;

import java.util.Scanner;

/**
 * Created by pc on 15.11.2015.
 */
public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Devides on 2");
        } else if (number % 3 == 0) {
            System.out.println("Devides on 3");
        } else if (number % 5 == 0) {
            System.out.println("Devides on 5");
        }

    }
}
