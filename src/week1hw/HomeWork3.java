package week1hw;

import java.util.Scanner;

/**
 *������������ ������ �����. ������� �� ����� ��� ��������� ��������,���� ����� ������� �� 7 ������.
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
