package week1hw;

import java.util.Scanner;

/**
 *Пользователь вводит число. Вывести на экран его удвоенное значение,если число делится на 7 нацело.
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        if (num % 7 == 0){
            System.out.println(num*2);
        }
    }
}
