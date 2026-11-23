package arraystring;


public class mergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2){
        var result = new StringBuilder();
        int i = Math.max(word1.length(), word2.length());

        int count = 0;
        while (count < i){
            if (count < word1.length()){
                result.append(word1.charAt(count));

            }
            if (count < word2.length()){
                result.append(word2.charAt(count));
            }
            count++;
        }

        return result.toString();
    }
}
