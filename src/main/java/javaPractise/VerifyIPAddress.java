package javaPractise;

import java.util.Scanner;

public class VerifyIPAddress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your IP address");
        String ip = sc.next();
        boolean flag = true;
        String[] segments = ip.split("\\.");//

           if(segments.length == 4){
               for(String s : segments){
                  int i = Integer.parseInt(s);
                   if(i < 0 || i > 255 )
                       flag = false;
                   break;
               }
        }else flag = false;
           if(flag)
               System.out.println("IP is valid");
           else
               System.out.println("invalid IP address");
    }

}
