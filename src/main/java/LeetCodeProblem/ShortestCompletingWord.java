package LeetCodeProblem;

public class ShortestCompletingWord {
    public static void main(String[] args) {
       String[] words = {"step","steps","stripe","stepple"};
       String licensePlate = "1s3 PSt";
        System.out.println(checkShortestCompletedWord(licensePlate,words));
    }

    public static String checkShortestCompletedWord(String licensePlate, String[] words){
        String lp = licensePlate.toLowerCase();
        //get char Count
        int[] lpChar = new int[26];
        String minStr="";
        int min = Integer.MAX_VALUE;

        for(int i=0; i<lp.length(); i++){
            char c = lp.charAt(i);
            if(c >= 'a' && c<= 'z' ){
                lpChar[c - 'a']++;
            }
        }


        //try to get char count of each word
        for(int i=0; i<words.length; i++){
            int[] charTemp = lpChar.clone();

            for(int j=0; j<words[i].length(); j++){
                char k = words[i].charAt(j);
                charTemp[k -'a']--;
            }

            boolean contains = true;
            for(int j=0; j<charTemp.length; j++)
            {
                if(charTemp[j] > 0){
                    contains = false;
                    break;
                }
            }
            if(contains && words[i].length() < min){

                min = words[i].length();
                minStr = words[i];
            }
        }
        return minStr;
    }

}
