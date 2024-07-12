package ThirtyDaysChallenge;

/*
Given a string s containing lowercse Eng letter, and a matrix shif;
shift[i] = [direction,amount];

eg: s = "abc", shift = [[0,1],[1,2]] --> bca abc cab
output: "cab"

->value [0,1] -> 0->shift left, 1 time
-> value [1,2] -> 1->shift right, 2 time
*** we need to remember below formula not to shift as per given time
 value[1]%string.length; eg: 4times%3 = 1 -> only 1 time need to shift

 s = "abcdefg" -> 10times%7 = 3
 leftshift -> s.substring(3) return defg + s.substring(0,num) retrun ab
 defgab


 */



public class ShiftString {
    public static void main(String[] args) {
        String s = "abcdefg";
        int[][] shift = {{1,1},{0,2},{1,3}};
       String result = stringShiftOpt(s,shift);
        System.out.println(result);
    }

    public static String stringShift(String s, int[][] shift){

        for(int[] value : shift){
            if(value[0] == 0){
                s = leftShift(s,value[1]);
            }else {
              s =  rightShigt(s,value[1]);
            }
        }
        return s;
    }

    public static String leftShift(String s, int num){
        return s.substring(num) + s.substring(0,num);
    }

    public static String rightShigt(String s, int num){
        return s.substring(s.length()-num) + s.substring(0,s.length()-num);
        //abcdefg -> rightShift 2 times
        //num=2, fg + abcde
    }

    /*
    Better approach
    ***Equal number left shift cancels the equal number right shift operation
    Based on that observation, whenever we encounter zero (left shift) add amount to rotate account
    we encounter 1 substract it from rotate account

    if the result -> positive-> do left shift by that amount
                  -> negative-> do right shigt by that amount

     */

    public static String stringShiftOpt(String s, int[][] shift){
        int rotateCount = 0;

        for(int[] value : shift){
            if(value[0] == 0){
                rotateCount += value[1];
            }else {
                rotateCount -=value[1];
            }
        }

        //Effective Rotation
        rotateCount = rotateCount % s.length(); // 10%7 = 3

        if(rotateCount>0){
            s = leftShift(s,rotateCount);
        }else if(rotateCount < 0){
            s = rightShigt(s,-(rotateCount));
        }
        return s;

    }

    /*
    Time complexity O(n+s) -> O(n)
    Space complexity O(n)
     */
}
