package week1hw;

import java.util.Scanner;

/**
 4.1. ������������ ������ �������� � ������� (������� ��� �� 0 �� 24)
 ���� ����� �� 9 �� 18, �� ������� "� �� ������", � ������ ������ "� �������")
 */

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter recent time: ");
        int inRecentTime = -1;

        while (inRecentTime < 0 || inRecentTime > 24) {
            inRecentTime = scanner.nextInt();
            System.out.println("Invalid number. Try again.");
        }
        if (inRecentTime >= 9 && inRecentTime <= 18) {
            System.out.println("I'm at work.");
        }
        else {
            System.out.println("I have the rest.");
        }

    }
}
