package ThirtyDaysChallenge.twoPointers;

import java.util.Arrays;

public class IsPalindrome {

    public static void main(String[] args) {
       boolean result = checkPalindrome("Was it a car or a cat I! saw?");
        System.out.println(result);
    }

   public static boolean checkPalindrome(String str) {

       //if same with reverse order -> it is palindrome
      // String test = str.replaceAll("\\s","").toLowerCase();
       String test = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       System.out.println(test);



       //2nd check with 2 pointers
     //  String arr[] = str.split("");
       //str = madam  l=2, r=2

       int left=0; int right = test.length()-1;
       while(left <= right){
           if(test.charAt(left) == test.charAt(right)){
               left++;
               right--;
           }else{
               return false;
           }
       }
       return true;


   }
}
