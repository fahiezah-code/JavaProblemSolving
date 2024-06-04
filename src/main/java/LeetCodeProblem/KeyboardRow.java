package LeetCodeProblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

public class KeyboardRow {

    public static void main(String[] args) {

        String[] words = new String[]{"Hello","Alaska","Dad","Peace"};
        //String[] result = findWords(words);
        String[] result = findWordsByHashSet(words);
        for(String s: result){
            System.out.print(s+" ");
        }
    }

    //approach-2, using 3HashSet
    /* create 3 strings for 3 row and add each into respective hashSet
       create new Arraylist, to add the result
       check each char of word whether it includes in Set,
       finally check length of word is equal set count length
     */
    public static String[] findWordsByHashSet(String[] words) {
        String firstRow = "QWERTYUIOPqwertyuiop";
        String secondRow = "ASDFGHJKLasdfghjkl";
        String thirdRow = "ZXCVBNMzxcvbnm";

        //create 3 HashSet
        HashSet<Character> firstHS = new HashSet<>();
        HashSet<Character> secondHS = new HashSet<>();
        HashSet<Character> thirdHS = new HashSet<>();
        //add into HashSet
        for (int i = 0; i < firstRow.length(); i++) {
            firstHS.add(firstRow.charAt(i));
        }
        for (int i = 0; i < secondRow.length(); i++) {
            secondHS.add(firstRow.charAt(i));
        }
        for (int i = 0; i < thirdRow.length(); i++) {
            thirdHS.add(firstRow.charAt(i));
        }
        //create new ArrayList for result
        ArrayList<String> result = new ArrayList<>();

        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            int fHSCount = 0;
            int sHSCount = 0;
            int tHSCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (firstHS.contains(word.charAt(i))) {
                    fHSCount++;
                } else if (secondHS.contains(word.charAt(i))) {
                    sHSCount++;
                } else {
                    tHSCount++;
                }
            }
            if (fHSCount == word.length() || sHSCount == word.length() || tHSCount == word.length()) {
                result.add(word);
            }
        }
        //create new Array for return String[]
        String[] ans = new String[result.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    //approach-1, using Java8
    public static String[] findWords(String[] words){

        return Stream.of(words).filter(w->w.toLowerCase()
                .matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
                .toArray(String[]::new);
    }
}
