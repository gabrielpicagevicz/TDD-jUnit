import java.util.Objects;

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




        return mdc(a - b, b);
    }
    public static int mdc(int ...valores){
        Objects.requireNonNull(valores, "O parametro não pode ser nullo");

        if(valores.length == 0){
            throw new IllegalArgumentException("É PRECISO INDICAR PELO MENOS 1 VALOR");
        }
        int a = valores[0];
        for (int b: valores){
            a = mdc(a,b);
        }
        return a;
    }
}
