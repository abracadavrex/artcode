package week2hw;

import utils.MathUtils;

import java.util.Scanner;

public class primeNumberUtilTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(MathUtils.primeNumber(number));
    }
}
