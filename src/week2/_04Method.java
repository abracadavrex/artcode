package week2;

/**
 * Created by pc on 21.11.2015.
 */

import utils.MathUtils;
public class _04Method {
    public static void main(String[] args) {
        double number = 15.89598;
        double number2 = 69.2343254632323;
        double round = MathUtils.roundToHundreds(number2);
        System.out.println(round);

    }
}
