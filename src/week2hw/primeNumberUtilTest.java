package week2hw;

import utils.mathUtils;

import java.util.Scanner;

public class primeNumberUtilTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(mathUtils.primeNumber(number));
    }
}
