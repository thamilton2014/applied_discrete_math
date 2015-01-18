package assignment_2;

/**
 * Created by thamilton on 1/18/15.
 */
public class TestCase {

    public static void main(String[] args) {
        int size = 12;
        double time = 0;
        for (int i = 0; i < size; i++) {
            long t0 = System.nanoTime();
            vbrf(i);
            long t1 = System.nanoTime();
            time += (t1 - t0);
        }
        System.out.println((time * 1.0e-9) + "");
    }

    public static long vbrf(int x) {
        if (x == 0) return 2;
        if (x == 1) return 3;
        if (x == 2) return 4;
        if (x == 3) return 5;
        return vbrf(x - 1) - vbrf(x - 2) + 3 * (vbrf(x - 3)) - 2 * (vbrf(x - 4));
    }
}
