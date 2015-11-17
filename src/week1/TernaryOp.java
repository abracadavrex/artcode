package week1;

/**
 * Created by pc on 15.11.2015.
 */
public class TernaryOp {
    public static void main(String[] args) {
        int age = 35;
        String message = "";

//        if (age >60)
//            message = "old";
//        else
//            message = "young";

        message = age>60 ? "old" : "young";

        System.out.println(message);

    }
}
