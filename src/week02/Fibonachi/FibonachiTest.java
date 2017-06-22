package week02.Fibonachi;

/**
 * Created by hamster on 16.05.2017.
 */
public class FibonachiTest {
    public static void main(String[] args) {
        f(3);
    }
    private static int f(int n) {
        int result;
        if (n == 0 || n == 1) {
            result = n;
        } else {
            result = f(n - 2) + f(n - 1);
        }
        System.out.print(n);
        return result;
    }
}
