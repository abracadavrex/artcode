package week2hw;

import utils.arrayUtils;

/**
 * Created by pc on 27.11.2015.
 */
public class arrayInvertTest {
    public static void main(String[] args) {
        int[] array = arrayUtils.createAndFillArray(10);
        arrayUtils.showArray(array);
        arrayUtils.showArray(arrayUtils.arrayInvert(array));
        array = arrayUtils.createAndFillArray(11);
        arrayUtils.showArray(array);
        arrayUtils.showArray(arrayUtils.arrayInvert(array));
    }
}
