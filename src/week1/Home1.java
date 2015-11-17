package week1;

import java.util.Scanner;

/**
 * Created by pc on 15.11.2015.
 */
public class Home1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int counter = 0;

        int a = number / 100;
        int b = (number % 100) / 10;
        int c = number  % 10;
        if (a==5)
            counter++;
        if (b==5)
            counter++;
        if (c==5)
            counter++;
        System.out.println("There are " + counter + " digits 5 in " + number);
    }
}
