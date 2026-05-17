package arraystring;

public class reverseWordsString {
    public static String rws(String s) {
        int j = s.length() - 1;
        int b = 0;
        StringBuilder a = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ' && i<j){
                a.append(s.substring(i + 1, j + 1));
                a.append(' ');
                while (i >= 0 && s.charAt(i) == ' '){
                    i--;
                }
                j = i;
            }
        }
        a.append(s.substring(0, j + 1));
        return a.toString().trim();
    }
}
