package week2hw;

import utils.arrayUtils;


public class arrayMoveRightTest {
    public static void main(String[] args) {
        int[] array1 = arrayUtils.createRandomUnicalElementsArray(10, 50);
        arrayUtils.showArray(array1);

        int[] array2 = arrayUtils.moveArrayRight(array1,3);
        arrayUtils.showArray(array2);
    }

}
