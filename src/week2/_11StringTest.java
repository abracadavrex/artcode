package week2;

import utils.stringUtils;

/**
 * Created by pc on 22.11.2015.
 */
public class _11StringTest {
    public static void main(String[] args) {
        String name = new String("jenja");
        System.out.println(name);
        String name2 = "Aaleg";
        System.out.println(name2);
        char[] letters = {'O', 'l', 'j', 'a'};
        String name3 = new String(letters);
        System.out.println(name3);

        boolean equals = name.equals(name2);
        int length = name.length();
        char letter = name.charAt(3);
        int index = name.indexOf('a');
        char[] letters2 = name.toCharArray();
        String subString = name.substring(0, 4);
        String sub2 = name.substring(1);
        boolean answer = name.endsWith("j");
        boolean answer2 = name.contains("j");
        String[] names = name2.split(", ");
        String newName = name.toUpperCase();
        int compare = name.compareTo(name2);

        System.out.println(" ");

        System.out.println(equals);
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(letters2);
        System.out.println(subString);
        System.out.println(sub2);
        System.out.println(answer);
        System.out.println(answer2);
        System.out.println(names);
        System.out.println(newName);
        System.out.println(compare);
        System.out.println(" ");
        System.out.println(stringUtils.letterCounter(name,'a'));
        System.out.println(stringUtils.letterCounter(name2,'a'));
    }
}
