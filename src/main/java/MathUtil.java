public class MathUtil {

    static public int mdc(final int a, final int b) {

        if (b > 0 && a % b == 0) {
            return b;
        }
        return -1;
    }

}
