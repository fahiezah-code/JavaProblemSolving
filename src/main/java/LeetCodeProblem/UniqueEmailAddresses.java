package LeetCodeProblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {

        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
      //  System.out.println(numUniqueEmails(emails));
        numUniEmails(emails);

    }
    public static void numUniEmails(String[] emails){
        Set<String> set = new HashSet<>();

        for(String email : emails){
            String[] str = email.split("@"); //got str[0][1]
            String localName = str[0];
           localName = localName.replace(".","");
           if(localName.indexOf('+') > 0){
               localName = localName.substring(0,localName.indexOf('+'));
           }
           String domainName = str[1];

           String key = localName + '@'+domainName;
           set.add(key);
        }
        System.out.println(set);

    }
    public static int numUniqueEmails(String[] emails){
        //String domainName //use subString()->take from @,end
        //String localName //subString() ->take from 0,@ (before @)
        Set<String> str = new HashSet<>();
        for(int i=0; i< emails.length; i++){
            String localName = "";
            String domainName = "";
            String word = emails[i].toLowerCase();
            int length = word.indexOf('@');
                for(int j=0; j<length; j++) {
                    if (word.charAt(j) >= 'a' & word.charAt(j) <= 'z') {
                        localName += word.charAt(j);
                    }else if(word.charAt(j) == '+'){
                        break;
                    }
                }

                for(int k=length; k<word.length(); k++){
                    domainName += word.charAt(k);
                }

                String unique = localName + domainName;
                 System.out.println(unique);
                str.add(unique);

            }
        return str.size();
        }

    }

