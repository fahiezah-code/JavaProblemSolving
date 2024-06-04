package javaPractise;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,-5,1,-2,3,8,5};
        findMaxSumContiguOusSubArray(arr);
        findMaxTotalSum(arr);
    }

    private static void findMaxTotalSum(int[] arr) {
        int sum = arr[0];
        int maxTotalSum = arr[0];
        for(int i=1; i<arr.length; i++){
            if( sum < sum + arr[i]){
                sum += arr[i];
            }

            maxTotalSum = Math.max(sum, maxTotalSum);
        }
        System.out.println(maxTotalSum);
    }

    public static void findMaxSumContiguOusSubArray(int[] arr){

        int sum = arr[0];
        int maxSum = arr[0];

        for(int i=1; i<arr.length; i++){
            if(sum < 0){
                sum = arr[i];
            }else{
                sum += arr[i];
            }
           maxSum = Math.max(sum,maxSum);
        }
        System.out.println(maxSum);

    }

}
