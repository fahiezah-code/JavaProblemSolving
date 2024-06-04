package javaPractise;

public class FindMissingLetterInArray {

    public static void main(String[] args) {
        findMissingletter(new String[]{"p", "r", "s"});

    }

    public static void findMissingletter(String[] strArray) {

        //p q r  t  ---> s
        //i 1 == [i+1] - [i] //otherwise return [i]+1
        //take value and add 1 and check whether it is in array

        for (int i = 0; i < strArray.length - 1; i++) {
           // if (Integer.valueOf(strArray[i+1].charAt(0)) - Integer.valueOf(strArray[i].charAt(0)) != 1) {
             //   String letter = (char)(strArray[i].charAt(0) + 1);
              //  System.out.println(letter);

           if(strArray[i+1].charAt(0) - strArray[i].charAt(0)>1) {
               String missingLetter = ""+(char) ((int)strArray[i].charAt(0)+1);
               System.out.println(missingLetter);
            }
            }

        }

    }
