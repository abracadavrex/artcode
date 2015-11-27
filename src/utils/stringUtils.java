package utils;

public class stringUtils {
    public static int letterCounter (String stringIn, String  letter){
        int counter = 0;
        stringIn = stringIn.toLowerCase();
        letter = letter.toLowerCase();
        for (int i = 0; i < stringIn.length(); i++){
            if (stringIn.charAt(i) == letter.charAt(0)) counter++;
            } return counter;
        }

    }

