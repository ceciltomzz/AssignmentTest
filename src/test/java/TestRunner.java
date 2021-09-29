import java.util.Set;

public class TestRunner {

    public static void main(String[] args) {
        String inputString="Working";
        String [] possibleCombinations=DictionaryUtil.getAllPossibleCombinations(inputString);
        Set<String> permSet=null;
        for(String posiblecom : possibleCombinations){
            permSet=DictionaryUtil.getCombinations(posiblecom);
        }
        System.out.println(permSet);
        System.out.println(permSet.size());
    }
}
