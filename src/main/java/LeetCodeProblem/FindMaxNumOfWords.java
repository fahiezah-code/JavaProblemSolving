package LeetCodeProblem;

public class FindMaxNumOfWords {
    public static void main(String[] args) {

        String[] sentences = new String[]{"alice and bob love leetcode",
                "i think so too", "this is great thanks very much"};
        System.out.println(checkMaxNumWords(sentences));
    }

    public static int checkMaxNumWords(String[] sentences){

        int maxSize = 0;
        for(String sentence : sentences){
            String[] str = sentence.split(" ");
            int size = str.length;
            maxSize = Math.max(size,maxSize);

        }
        return maxSize;


    }
}
