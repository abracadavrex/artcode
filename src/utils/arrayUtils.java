package utils;

import java.util.Scanner;

public class arrayUtils {
    public static void showArray (char[] array){
//        logic
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void showArray (int[] array) {
//        logic
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void showArray (String[] array) {
//        logic
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createAndFillArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++){
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public static int[] createRandomArray(int size, int range){
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
            numbers[i] = getGenerateRandomDigit(range);
        }
        return numbers;
    }


    public static int[] createRandomUnicalElementsArray(int size, int range){
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++){
            do { numbers[i] = getGenerateRandomDigit(range);
        } while (unicalElementOfArray(numbers,i) == false);

        }

        return numbers;
    }

    private static boolean unicalElementOfArray (int[] array, int counter){
        for (int i = 0; i < counter; i++) {
            if (array[i] == array[counter]) return false;
        };
        return true;
    }


    private static int getGenerateRandomDigit(int range){
        return (int)(Math.random() * range);
    }

    public static int[] sortArray (int[] array) {
        for (int j = 0; j < array.length; j++){
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int findMinMaxElementOfArray (int[] array, String parametr){
        int i = 1;
//        String par = new String (parametr);
        if  (parametr.equals("min")){
            int minElement = array[0];
            while (i < array.length){
                if (array[i] < minElement) minElement = array[i];
                i++;
            } return minElement;
        } else if (parametr.equals("max")){
            int maxElement = array[0];
            while (i < array.length){
                if (array[i] > maxElement) maxElement = array[i];
                i++;
            } return maxElement;
        } else System.out.println("Wrong parametr. Use min or max.");
        return 0;
    }

    public static int[] enterArray (int size, int rangeMin, int rangeMax){
        Scanner scanner = new Scanner (System.in);
        int[] array = new int [size];
        for (int i = 0; i < size; i++){
            System.out.printf("Enter number %d: ", i+1);
            array[i] = scanner.nextInt();
            if (unicalElementOfArray(array, i) == false){
                System.out.print("You already enter this number. Try again: ");
                i--;
            } else if (array[i] < rangeMin) {
                System.out.print("Out of range. More than " + rangeMin + "\nTry again.");
                i--;
            } else if (array[i] > rangeMax) {
                System.out.print("Out of range. Less than " + rangeMax + "\nTry again.");
                i--;
            }
        }
        return array;
    }

    public static int findEquialElements (int[] array1, int array2[]){
        int counter = 0;
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]) counter++;
            }
        } return counter;
    }

    public static int[] moveArrayRight (int[] arrayIn, int move){
        int[] arrayOut = new int[arrayIn.length];
        int i;
        for ( i = 0; i < move; i++){
            arrayOut[arrayOut.length - move + i] = arrayIn[i];
        }
        for ( ; i < arrayOut.length; i++){
            arrayOut[i - move] = arrayIn[i];
        }
        return arrayOut;
    }
}
