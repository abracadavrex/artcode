package week1;

public class DataTypes {
    public static void main(String[] args) {
//        <data_type> <variable_name>;
//        <var_name> = <data>;
        int age;
        age = 26;
        long bigNumber = 255555555555555555L;

//        System.out.println(age);

        double cost = 24.8;
        float newCost = 24.8f;


        byte smallNumber = (byte) age;
        System.out.println(smallNumber);
        System.out.println(cost);
        System.out.println(smallNumber + cost);

        double newAge = age;

        char symbol = 'A';
        char symbol2 = 'S';
        char symbol3 = 'd';
        char symbol4 = 'F';

        System.out.print(symbol + "" + symbol2);
        System.out.println(symbol3);
        System.out.println(symbol4);

        boolean isTrue;
        isTrue = false;

        boolean isFalse = 26 == 1;
        System.out.println(isFalse);

        String name = "Andrei";
        System.out.println(name);
    }
}
