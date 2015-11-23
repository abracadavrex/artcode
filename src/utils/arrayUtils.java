package utils;

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
}
