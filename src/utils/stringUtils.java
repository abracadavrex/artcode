package utils;


public class stringUtils {
    public static int letterCounter (String stringIn, char letter){
        int counter = 0;
        for (int i = 0; i < stringIn.length(); i++){
            if (stringIn.charAt(i) == letter) counter++;
            } return counter;
        }

    }

