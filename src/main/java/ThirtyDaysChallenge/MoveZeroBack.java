package ThirtyDaysChallenge;

public class MoveZeroBack {

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,3,0};
       int[] result = moveZero(arr);
       for(int i : result){
           System.out.print(i + " ");
       }
    }

    public static int[] moveZero(int[] arr){
        //[1,0,2,3,0] -> 1,2,3,0,0
        //do loop, Traverse an array & first move all non-zero element at the front.
        // if arr[i] != 0,  arr[count++]=arr[i] //c3
        // while (count < len){ arr[count++] = 0;}
        int count = 0;
        int len = arr.length;
        for(int i=0; i<len; i++){

            if(arr[i] !=0){
                arr[count++] = arr[i];
            }
        }
        while(count < len){
            arr[count++] = 0;
        }

        return arr;
    }
}
