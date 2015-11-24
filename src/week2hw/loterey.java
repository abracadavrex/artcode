package week2hw;

import utils.arrayUtils;

public class loterey {
    public static void main(String[] args) {
        int[] ticket = arrayUtils.createRandomUnicalElementsArray(6, 43);
        arrayUtils.sortArray(ticket);

        int[] userArray = arrayUtils.enterArray(6, 1, 42);
        arrayUtils.sortArray(userArray);

        System.out.print("Your ticket: ");
        arrayUtils.showArray(ticket);
        System.out.print("Your input:  ");
        arrayUtils.showArray(userArray);

        int counter = arrayUtils.findEquialElements (ticket,userArray);

        if (counter < 3) {
            System.out.println("Game over. Looser.");
        } else if (counter == 3) {
            System.out.println("Not bad. 3 right per 6.");
        } else if (counter == 4) {
            System.out.println("Good. 4 of 6.");
        } else if (counter == 5) {
            System.out.println("Great. 5 of 6.");
        } else System.out.println("EXCELLENT!!! Absolute win! 6 of 6!");
    }
}
