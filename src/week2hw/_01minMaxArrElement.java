package week2hw;

import utils.arrayUtils;

public class _01minMaxArrElement {
    public static void main(String[] args) {

        int[] numbers = arrayUtils.createRandomArray(10, 50);
        arrayUtils.showArray(numbers);

        System.out.println("Minimal element: " + arrayUtils.findMinMaxElementOfArray(numbers,"min"));
        System.out.println("Maximal element: " + arrayUtils.findMinMaxElementOfArray(numbers,"max"));
    }
}
