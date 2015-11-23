package week2;

import java.util.Scanner;

/**
 * Created by pc on 22.11.2015.
 */
public class _10Counter8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int counter = 0;
        while (true){
            int tmp = number % 10;
            if (tmp == 8){
                counter ++;
            }
            number /= 10;
            if (number == 0) break;
        }
        System.out.println("Your number consists " + counter + " eights.");
    }
}
