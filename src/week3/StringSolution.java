package week3;

import java.util.Scanner;

/**
 *Ввести предложение с консоли, найти самое короткое и самое длинное слово.
 * Вывести найденные слова и их длину.
 */
public class StringSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String sentence = scanner.nextLine();
        String shortestWord = findShortestWord(sentence);
        String longestWord = findLongestWord(sentence);

        System.out.printf("Longest: %s; shorterts: %s.",longestWord, shortestWord);
    }

    private static String findShortestWord (String sentence){
        String [] words = sentence.split(" ");
        String shoterstWord = words[0];
        for (int i = 1; i < words.length; i++){
            if (words[i].length() < shoterstWord.length()){
                shoterstWord = words[i];
            }
        }
        return shoterstWord;
    }


    private static String findLongestWord (String sentence){
        String [] words = sentence.split(" ");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++){
            if (words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }
        return longestWord;
    }
}
