package week3;

/**
 * Created by pc on 29.11.2015.
 */
public class _08FirstRecursion {
    public static void main(String[] args) {
        a(1);
    }

    private static void a(int i){
        if (i == 100) return;
        i += 1;
        System.out.println(i);
        a(i);
    }
}
