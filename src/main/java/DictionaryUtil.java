import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class DictionaryUtil {
    /**
     *
     * @param inputString
     * @return HashSet of All Possible Combinations
     */
    public static final Set<String> getCombinations(String inputString) {
        Set<String> ss = new HashSet<String>();
        if (inputString == null) {
            return null;
        }
        if (inputString.length() == 0) {
            ss.add("");
        } else {
            char c = inputString.charAt(0);
            String st = inputString.substring(1);
            Set<String> qq = getCombinations(st);
            for (String str : qq) {
                for (int i = 0; i <= str.length(); i++) {
                    if(Dictionary.isEnglish(str)){
                        ss.add(comb(str, c, i));
                    }

                }
            }
        }
        return ss;

    }

    /**
     *
     * @param s Start String
     * @param c Character c
     * @param i Index
     * @return
     */
    public static final String comb(String s, char c, int i) {
        String start = s.substring(0, i);
        String end = s.substring(i);
        return start + c + end;
    }

    /**
     * @Performs -Given a string it finds all possible Combinations it can form with that String length
     * @param inputstring
     * @return
     */
    public static String[] getAllPossibleCombinations(String inputstring) {
        inputstring=inputstring.toLowerCase();
        int n = inputstring.length();
        String[] inputArray = new String[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = inputstring.substring(0, i) + inputstring.substring(i + 1);
        }
        return inputArray;
    }
}
