package week2hw;

import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pcNumber = (int)(25 + (Math.random() * 100));
        System.out.println("I want to play one game with you. \n" +
                            "Guess number between 25 and 125. \n" +
                            "I made a choice.\nLet's go.");

        int gamerNumber = 0, i = 0;

        while (i < 5){
            System.out.printf("You have %d attempts. Enter --> ", 5 - i);
            do  {
                gamerNumber = scanner.nextInt();
            } while (gamerNumber < 25 || gamerNumber > 125);

            if (gamerNumber == pcNumber) {
                if (i == 0) {
                    System.out.println("EXCELLENT!!! One shot - one kill!");
                    break;
                } else if (i == 1) {
                    System.out.println("Great! Just second try.");
                    break;
                } else if (i == 2) {
                    System.out.println("Good.");
                    break;
                } else if (i == 3) System.out.println("Not bad.");
                else {
                    System.out.println("Last try - best try, my little dummy. You win.");
                    break;}
                }
            else {
                if (Math.abs(pcNumber - gamerNumber) <= 2) System.out.println("So close...");
                else if (Math.abs(pcNumber - gamerNumber) <= 6) System.out.println("You have enough chances to win!");
                else if (pcNumber - gamerNumber <= 12 && pcNumber - gamerNumber > 0) System.out.println("Add just a little bit.");
                else if (gamerNumber - pcNumber <= 12) System.out.println("Substract a litlle bit.");
                else System.out.println("No.");
            }
            i++;
        }
    }
}
