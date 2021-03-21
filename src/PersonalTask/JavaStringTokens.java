package PersonalTask;

import java.io.*;
import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();

        if (s.length()==0) {
            System.out.println(0);
        } else {
            String[] words = s.split("[ !,?._'@]+");

            int count = words.length;

            System.out.println(count);

            for (String answer : words) {
                {
                    System.out.println(answer);
                }
                // Write your code here.
            }
        }


        scan.close();
    }
}
