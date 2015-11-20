package week1hw;

//4) »звестны две скорости, одна в километрах в час, друга€ в метрах в
//        секунду.          ака€ из них больше?

import java.util.Scanner;

public class HWAd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter km/h speed: ");
        int speedKpH = scanner.nextInt();

        System.out.print("Enter metres per second speed: ");
        double speedMpS = scanner.nextDouble();

        speedMpS = speedMpS * 3.6;
        if (speedKpH > speedMpS){
            System.out.println(speedKpH + " km/h higher.");
        } else if (speedKpH < speedMpS) {
            System.out.println(speedMpS + " metres per second higher");
        } else System.out.println("Equial.");
    }
}
