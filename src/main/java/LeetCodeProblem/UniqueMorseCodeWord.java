package LeetCodeProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWord {
    public static void main(String[] args) {
        String[] words = new String[]{"gin","zen","gig","msg"};
       // getUniqueMorseQuote(words);
        System.out.println(getUniqueMorseQuoteByother(words));

    }
    public static int getUniqueMorseQuoteByother(String[] words){
        String[] morseArray = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....",
                "..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set<String> ans = new HashSet<>();

        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){
                sb.append(morseArray[c-'a']);
            }
            ans.add(sb.toString());
        }
        return ans.size();
    }
    public static void getUniqueMorseQuote(String[] words){
        //create morseQuote array
        String[] morseArray = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....",
                "..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        char[] letter = new char[26];
        char c = 'a';
        for(int i=0; i<letter.length; i++){
            letter[i] = c;
            c++;
        }
        Set<String> set = new HashSet<>();
        for(String word : words){
            String ans ="";
           for(int i=0; i<word.length(); i++){  // word - abc i=0
              char k = word.charAt(i); //a
              for(int j=0; j<letter.length; j++ ){
                  if(k == letter[j]){
                      int index = j;
                       ans += morseArray[index]; //a
                      break;
                  }
              }
           }
           set.add(ans);
       }
        System.out.println(set.size());
        for(String test : set){
            System.out.println(test);
        }

    }
}
