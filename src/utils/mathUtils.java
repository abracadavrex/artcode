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
}
