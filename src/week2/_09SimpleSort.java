package week2;

import utils.arrayUtils;

public class _09SimpleSort {
    public static void main(String[] args) {
        int[] numbers = arrayUtils.createRandomArray(10, 20);
        arrayUtils.showArray(numbers);

        numbers = arrayUtils.sortArray(numbers);
        arrayUtils.showArray(numbers);
    }
}
