package utils;

//                      (void - if nothing to return)
//    public  static <returnType> <name_verb>  {
//                                              () if nothing to input
//
//
//    return <arg>;}

public class mathUtils {
    public static  double roundToHundreds(double number){

//        logic
        double round = ((int)(number * 100)) / 100.0;

        return round;
    }

    public static boolean primeNumber (int number){
//        logic
        for (int i = 2; i < number / 2; i++){
            if (number % i == 0) return false;
        }
        return true;
    }
}
