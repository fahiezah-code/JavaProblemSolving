package javaDSAlgorith;

public class BubbleAndSelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,9,4,3,12,6,8,7};
       // sortByBubble(arr);
        sortByBruteForce(arr);
    }


    public static void sortByBruteForce(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void sortByBubble(int[] arr) {
        //outer loop is for num of iteration
        for (int i = 0; i < arr.length; i++) {
            //inner loop is for swapping 2 num
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) { // ** if we change "<" here it will sort descending
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}
