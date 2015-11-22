package week2;

import java.util.Scanner;

/**
 * Created by pc on 21.11.2015.
 */
public class _05Arrays2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        array[0] = scanner.nextInt();

        System.out.println("Enter second number: ");
        array[1] = scanner.nextInt();

        System.out.println("Enter third number: ");
        array[2] = scanner.nextInt();

        System.out.println("Enter fourth number: ");
        array[3] = scanner.nextInt();
//        array[0]=0;
//        array[1]=1;
//        array[2]=2;
//        array[3]=3;

        System.out.printf("%d, %d, %d, %d", array[0], array[1], array[2], array[3]);

        int numbers[] = {5, 6, 7, 8};
        System.out.printf("%d, %d, %d, %d", numbers[0], numbers[1], numbers[2], numbers[3]);
    }
}
