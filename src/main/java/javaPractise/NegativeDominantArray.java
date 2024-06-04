package javaPractise;

public class NegativeDominantArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 5, -4, 3, -6,7};
        checkNegative(arr);
        System.out.println(checkPositiveNegativeAlternative(arr));

    }

    public static void checkNegative(int[] nums){
        int negCount = 0;
        int posCount = 0;
       for(int i=0; i<nums.length; i++){
           if (nums[i] < 0) {
               negCount++;
           } else {
               posCount++;
           }
       }
       if(negCount > posCount){
           System.out.println("The array is negative dominance");
       }else System.out.println("The array is positive dominance");
    }
    public static String checkPositiveNegativeAlternative(int[] arr){

        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                if(arr[i] < 0){
                    return "which is not alternative";
                }
            }else {
                if(arr[i] > 0){
                    return "which is not alternative";
                }
            }
        }
        return "which is alternative";
    }

}
