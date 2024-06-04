package javaPractise;

/*
Given a rand[m,n] where 0 <= m <= n <= 2147483647
return the bitwise AND of all numbers in this range,inclusive.

Bitwise AND is a binary operator (&). It returns 1 if both the bits are 1
else it returns 0.
 */

public class BitWiseAndRange {

    public static void main(String[] args) {

     //   System.out.println(bitWiseAnd(5,7));
        System.out.println(bitWiseBruteForce(5,7));
    }

    public static int bitWiseBruteForce(int m, int n){

        int result = m;
        if(m == n ) {
            return m;
        }
        for(int i=m+1; i <=n; i++){
          result =  result & i;

          //Bitwise AND of any number with zero is always zero;
            if(result ==0) return 0;

            /*
            Suppose the input range is [2147483646, 2147483647]
            For handling the Integer max value;
            Integer max value is 2147483647 & if we don't handle
            this condition and keep doing +1 it shifts to -2147483648
        */
            if(i == Integer.MAX_VALUE){
                return result;
            }


        }
        return result;

    }


    // time complexity O(1)
    public static int bitWiseAnd(int m, int n){
        int shift = 0;
        while(m != n){
            m >>= 1;
            n >>= 1;
            shift++;
        }
        n <<= shift;
        return n;

    }

}
