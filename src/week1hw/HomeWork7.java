package week1hw;

import java.util.Scanner;

/**
 *  ������ ��� �����, ���� ���� �� ��� �������� �� ������ ��� �������,
 �� ������� true � ���������� ��������� ������� (����� ����� �� �������  � ������)
 � ������ ������ ������� false � ���������� ��������� ������� (����� ����� �� �������  � ������)
 */
public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int c = a / b;

        if (a%b == 0){
            System.out.println("true");
            System.out.print(c);
        }
        else {
            System.out.println("false");
            System.out.println(c);
            System.out.print(a % b);
        }

    }
}
