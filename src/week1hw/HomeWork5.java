package week1hw;

import java.util.Scanner;

/**
 * 4.5. ������ 2 �����. ���� ������ ����� ������ �������, �� ������� �� ����� ������� �����.
 ���� ������ ������, �� ������� �����.
 */
public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();

        if (a > b){
            System.out.println(a-b);
        }
        else if (a < b){
            System.out.println(a+b);
        }
        else{
            System.out.println("Equal. What's next?");
        }
    }
}
