package LeetCodeProblem;

import java.util.*;

public class FindMostCommonWord {

    public static void main(String[] args) {

        String paragraph = "Bob. hIt, baLl";
        String[] banned = new String[]{"bob", "hit"};
        checkMostCommonWord(paragraph, banned);

    }

    public static void checkMostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replaceAll("[,.]", "");
        System.out.println("para" + paragraph);

        // List<String> ls = new ArrayList<>(List.of(banned));
        List<String> ls = Arrays.asList(banned);


        String[] words = paragraph.toLowerCase().split(" ");
        Map<String, Integer> hmap = new HashMap<>();
        for (String word : words) {

            if (!ls.contains(word)) {
                if (hmap.containsKey(word)) {
                    hmap.put(word, hmap.get(word) + 1);
                } else {
                    hmap.put(word, 1);
                }

            }

        }
        int max = 0; String result = " ";
        for(Map.Entry<String,Integer> entry : hmap.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                result = entry.getKey();
            }

        }
        System.out.println(result);

    }

}