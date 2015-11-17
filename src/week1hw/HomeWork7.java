package week1hw;

import java.util.Scanner;

/**
 *  Вводим два числа, если одно из них делиться на другое без остатка,
 то выводим true и показываем результат деления (целую часть от деления  и остачу)
 в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
 */
public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a ,b ,c;
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();

        c=a/b;
        if (a%b == 0){
            System.out.println("true");
            System.out.print(c);
        }
        else {
            System.out.println("false");
            System.out.println(c);
            System.out.print(a%b);
        }
    }
}
