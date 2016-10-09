package week3;

/**
 * Created by pc on 29.11.2015.
 */
public class _07MethodCalls {
    public static void main(String[] args) {
        a();

    }

    private static void a(){
        b();
    }

    private  static void  b(){
        c();
    }

    private static void c(){
        System.out.println("Hello, I'm C! :)");
    }
}
