package week1hw;

import java.util.Scanner;

/**
 * 4.4. ������ ����� � ��������� ������ � �������, � ��������� ����� �� ��� � ��������� �� 0 �� 1
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the floating-point number using comma: ");
        float num = scanner.nextFloat();

        if (num >= 0 && num <= 1){
            System.out.println("Between 0 and 1.");
        }
        else {
            System.out.println("Out.");
        }
    }
}
