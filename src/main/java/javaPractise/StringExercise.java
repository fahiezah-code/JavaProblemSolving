package javaPractise;

import java.util.*;

public class StringExercise {

    public static void main(String[] args) {
        reverseString("hello");
        removeSpecialChars("  $ja! va$&s t%ar");
        removeDuplicateChar("programming");
        stringSorting("programming");
        findLongestSubString("abbacdd");
        reverseEachWord("learn java");
        checkOccurenceOfEachCharacter("programming");
        System.out.println();
        findFirstNonRepeatedChar("AABCDBE");
    }

    private static void findFirstNonRepeatedChar(String str) {

        //find the count of each chr,
        //return fist char with value 1,
        //so need to use LinkedHashMap-> to get preserved order
        //approach 1-> Collections-HashMap
        char[] ch = str.toCharArray();
        Map<Character,Integer> lhMap = new LinkedHashMap<>();
        for(int i=0; i<ch.length; i++){
            if(!lhMap.containsKey(ch[i])){
                lhMap.put(ch[i],1);
            }else {
                lhMap.put(ch[i],lhMap.get(ch[i])+1);
            }
        }
        for(char c : lhMap.keySet()){
            if(lhMap.get(c) ==1)
            {
                System.out.print("first non repeat char: "+c);
                break;///*** this is important to give output only 1
            }

        }
        System.out.println();

        //approach-2 -> use bruteForce ; don't use HashMap

        for(int i=0; i<str.length(); i++){
            boolean unique = true;
            for(int j=0; j<str.length(); j++) {
                if (i !=j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                }
            }
            if(unique){
                System.out.println(str.charAt(i));
                break;
            }

        }

    }

    //find Occurence of each character of a String

    public static void checkOccurenceOfEachCharacter(String str){
        //convert to charArray
        //use hashmap to check for frequency/count
        char[] ch = str.toCharArray();
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<ch.length; i++){
            if(!hmap.containsKey(ch[i])){
                hmap.put(ch[i],1);
            }else {
                hmap.put(ch[i],hmap.get(ch[i])+1);
            }
        }
        for(Map.Entry entry : hmap.entrySet()){
            System.out.print(entry+" ");
        }
    }

    //Reverse each word of a String
    public static void reverseEachWord(String str){
       //convert to charArray,
        //use split(" ")-> will get 2 word
        //reverse word
       //input: java code , output: avaj edoc

        String[] words = str.split(" ");
        String output = "";

        for(String word : words){
            String revWord = "";
            //reverse each word
            for(int i=word.length()-1; i>=0; i--){
                revWord = revWord + word.charAt(i);
            }
            System.out.println(revWord);
            output = output + revWord +" ";
        }
        System.out.println(output);
    }


    //find Longest SubString
    public static void findLongestSubString(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = str.toCharArray();
        //abdc --> ab i bac
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }

        }
        String longestSubString = map.keySet().toString();
        System.out.println("longest substring: "+longestSubString);
    }



    //sorting string alphabatical order
    public static void stringSorting(String str){
        char[] ch = str.toCharArray();
        //approach 1- java8
        str.chars().sorted().forEach(c-> System.out.print((char)c));

        System.out.println();

        //approach 2 -> bruteforce
        for(int i=0; i< ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
               if( ch[i] > ch[j]){
                   char temp = ch[i];
                   ch[i] = ch[j];
                   ch[j] = temp;
               }
            }
        }
        for(char c : ch){
            System.out.print(c);
        }
        System.out.println();

        Arrays.sort(ch);
        System.out.println(new String(ch));
        /*
        for(char k: ch){
            System.out.print(k);
        }
         */


    }

    // 4ways to reverse a String
    // Using toCharArray() method
    // Using charAt(int index) method
    // StringBuffer class provided reverse() method
    // StringBuilder class provided reverse() method

    //4 ways to remove duplicate chars
    //using java8 distic
    //using loop and find with indexOf() method
    //bruteforce nested loop with charArray
    //using Set interface

    public static void removeDuplicateChar(String str){

        //approach-1 -> java8 distinc()
        //str.chars().distinct().forEach(c-> System.out.print((char)c));
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c->sb1.append((char)c));
        System.out.println("approach-1: "+sb1);

        //approach-2 -> indexOf() method
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);
           int idx = str.indexOf(ch,i+1);
           if(idx == -1){
               sb2.append(ch);
           }
        }
        System.out.println("approach-2 :" + sb2);

        //approach-3 -> 2 loop with bruteforce By using toCharArray
        char[] ch = str.toCharArray();
        StringBuilder sb3 = new StringBuilder();

        for(int i=0; i<ch.length; i++){
            boolean repeated = false;
          for(int j=i+1; j<ch.length; j++){
             if(ch[i] == ch[j]){
                repeated = true;
                break;
                }
             }
            if(!repeated){
                sb3.append(ch[i]);
            }
        }
        System.out.println("approach-3: "+sb3);
        //approach-4 -> set interface
        StringBuilder sb4 = new StringBuilder();
        //Set<Character> set = new HashSet<>(); //pargimno
        Set<Character> set = new LinkedHashSet<>();//progamin
        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
        for(char c : set){
            sb4.append(c);
        }
        System.out.println("approach 4: "+sb4);
    }

    public static void reverseString(String str){
        char[] ch = str.toCharArray();
        String reverseStr ="";
        for(int i=ch.length-1; i>=0; i--){


           //Approach 1 ->toCharrArray() method
            System.out.print(ch[i]);

            //charAt() method
            reverseStr += str.charAt(i);
        }
        System.out.println();
        System.out.println(reverseStr);

        //Approach-3
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        //Approach-4
        StringBuffer sbuffer = new StringBuffer(str);
        System.out.println(sbuffer.reverse());
    }

    //Remove Special character from String
    //input: $ja!va$&st%ar
    //output: javastar

    public static void removeSpecialChars(String str){

        String ans ="";
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i) >=59 && str.charAt(i)<=90) ||
                    (str.charAt(i) >= 97 && str.charAt(i) <=122))
            ans += str.charAt(i);
        }
        System.out.print(ans);
        System.out.println();

        //use replaceALL method
        String result=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(result);

        //remove white Space from the string
        //input: "  ja va  st ar "
        //trim() method removes space for only before & end of string
        //need to use replaceAll() method
        String trimmed = str.trim();
        String str1 = str.replaceAll("\\s","");
        System.out.println("trim method: " + trimmed);
        System.out.println("remove space with \\s: "+ str1);
    }
}
