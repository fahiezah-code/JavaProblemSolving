package javaPractise;

/*
Given an array of N integers where N > 1.
Write a code to print the result/output such that result[i] is equal
to the product of all the elements of an array except self(result[i]).
eg: Input: {4,2,1,7}
    Output:{14,28,56,8}
 */


public class ProductEceptSelfInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,1,7};
        productExceptSelf(arr);
        System.out.println();
       int[] result = new int[arr.length];
       result = findProductUsingDivision(arr);
       for(int ans : result){
           System.out.print(ans+" ");
       }

    }

    public static int[] findProductUsingDivision(int[] arr){
        int len = arr.length;
        int[] ans = new int[len];
        int prod = 1;
        for(int i=0; i<arr.length; i++){
            prod = prod * arr[i];
        }
        for(int i=0; i< arr.length; i++){
            ans[i] = prod/arr[i];
        }
        return ans;
    }

    public static void productExceptSelf(int[] arr){
        int[] result = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int temp = 1;
            for(int j=0; j<arr.length; j++) { //len =4
                if (i != j) {
                    temp = temp * arr[j]; //8
                }
            }
              result[i] = temp;
        }
        for(int k: result){
            System.out.print(k+" ");
        }
    }

}
