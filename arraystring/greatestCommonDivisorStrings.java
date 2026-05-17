package arraystring;

public class greatestCommonDivisorStrings {
    public String gcdOfStrings(String str1, String str2){
        if(!(str1 +  str2).equals(str2 + str1)){
            return "";
        }
        int limite = mcd(str1.length(), str2.length());

        return str1.substring(0, limite);
    }
    private int mcd(int a, int b){
        if(b == 0){
            return a;
        }

        return mcd(b, a % b);
    }
}
