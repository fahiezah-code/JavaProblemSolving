package ThirtyDaysChallenge;

import java.util.HashSet;

public class IsHappyNumber {
    public static void main(String[] args) {

       boolean result = checkHappyNumber(20);
        System.out.println(result);

    }

    public static boolean checkHappyNumber(int num){
        //we create the set, it detect whether the number aldy have
        // while (num !=1){
        // current = num; sum = 0;
        //           while(current ! =0){ // to split the number & square
        //           lastDigit = currentNum%10
        //          sum = sum+(lastDigit * last Digit)
        //          current = current/10;
        //          }
        //  if(numSet.contains(sum)){ return false;}
        //   n = sum; numSet.add(sum)
        //
        //      }

        HashSet<Integer> hs = new HashSet<>();

        while(num != 1){
            int sum = 0;
            int current = num;
            while(current != 0){
                int rem = current%10;
                sum = sum + (rem * rem);
                current = current/10;
            }
            if(hs.contains(sum)){
                return false;
            }
            num = sum;
            hs.add(sum);
        }

        return true;

    }
}
