public class MathUtil {

    static public int mdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        if (b > 0 && a % b == 0)
        {
            return b;
        }

        if(b == 0)
        {
            return Math.abs(a);
        }

        if(a % b != 0)
        {
            return 1;
        }

        return -1;
    }

}
