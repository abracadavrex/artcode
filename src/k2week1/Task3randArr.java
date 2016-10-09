package k2week1;

/**
 * Created by pc on 09.10.2016.
 */
import java.util.Scanner;
public class Task3randArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input array's size: ");
        int inSize = sc.nextInt();
        System.out.print("Input array's range (max number): ");
        int inRange = sc.nextInt();

        int[] array = randomArray(inSize, inRange);
        System.out.println(arrToString(array, inSize));
    }

    public static String arrToString(int[] array, int size){
        String arrStr = "";
        for (int i = 0; i < size; i++){
            arrStr = arrStr + array[i] + " ";
        }
        return arrStr;
    }

    public static int[] randomArray (int size, int range){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (range * Math.random());
        }
        return array;
    }
}
