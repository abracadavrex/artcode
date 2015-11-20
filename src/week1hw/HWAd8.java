package week1hw;

import java.util.Scanner;

public class HWAd8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter check summ: ");
        double cSum = scanner.nextFloat(); //как сделать флоат?

        if (cSum > 1000){
            cSum = cSum - cSum * 0.1;
        }
        System.out.printf("Complete summ = %.2f", cSum);
    }
}
