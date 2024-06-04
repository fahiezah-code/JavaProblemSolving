package LeetCodeProblem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Palindrone {
    public static void main(String[] args) {
        String[] words = new String[]{"abc","car","ada","racecar","cool"};

        firstPalindrome(words);
        System.out.println(isPalindrome("racecar"));

    }

    public static String firstPalindrome(String[] words) {


        Map<String,Integer> map = new LinkedHashMap<>();
        String palindrome = "";
        String word ="";
        for(int i=0; i<words.length; i++){
            word = words[i];
            String reverseWord ="";
            for(int j=word.length()-1; j>=0; j--){
                reverseWord += word.charAt(j);
            }

            if(reverseWord.equals(word)){
                map.put(word,i);

            }
        }

        for(String pal : map.keySet()){
            palindrome = pal;
            System.out.println(pal);
            break;

        }
        return palindrome;

    }

    public static String checkPalindrome(String[] words) {
        for (String e : words) {
           // String rev = new StringBuilder(e).reverse().toString();
           String rev = new StringBuilder(e).reverse().toString();

            if (e.equals(rev)) {
                return e;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String word){


           int start = 0;
           int end = word.length()-1;

           while(start <= end){  //ada
               if(word.charAt(start) != word.charAt(end) ){
                   return false;
               }
               start ++;
               end --;
           }

       return true;
    }
}
