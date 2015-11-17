package week1hw;

import java.util.Scanner;
/**
 *  4.2. ѕользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        if (a >= b && a >=c){
            System.out.println(a + " is the biggest number.");
        }
        else if (b >= a && b >= c){
            System.out.println(b + " is the biggest number.");
        }
        else System.out.println(c + " is the biggest number.");


        if (a <= b && a <=c){
            System.out.println(a + " is the smallest number.");
        }
        else if (b <= a && b <= c){
            System.out.println(b + " is the smallest number.");
        }
        else {
            System.out.println(c + " is the smallest number.");
        }
    }
}
