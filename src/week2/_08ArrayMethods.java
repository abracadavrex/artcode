package week2;

import utils.arrayUtils;

public class _08ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = arrayUtils.createAndFillArray(100);
        arrayUtils.showArray(numbers);

        int[] newNumbers = arrayUtils.createRandomArray(10, 20);
        arrayUtils.showArray(newNumbers);
    }
}
