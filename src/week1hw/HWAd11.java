package week1hw;

import java.util.Scanner;

public class HWAd11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vedite kolichestvo kopeyek: ");
        int kop = scanner.nextInt();

        if (kop > 99) {
            System.out.println("Invalid number.");
        } else {
            if (kop >= 11 && kop <= 19) {
                System.out.print(kop + " kopeyek");
            } else {
                if (kop % 10 == 1) {
                    System.out.println(kop + " kopeyka");
                } else if (kop % 10 == 2 || kop % 10 == 3 || kop % 10 == 4) {
                    System.out.println(kop + " kopeyki");
                } else System.out.println(kop + " kopyeek");
            }
        }

    }
}
