package prefixsum;

public class FindHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int maxValor = 0;
        int valor = 0;
        for(int i = 0; i < gain.length; i++) {
            valor += gain[i];
            maxValor = Math.max(maxValor, valor);
        }
        return maxValor;
    }
}
