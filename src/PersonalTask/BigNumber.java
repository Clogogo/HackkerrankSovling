package PersonalTask;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        //Input
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();
        String[] string = new String[numb + 2];
        for (int i = 0; i < numb; i++) {
            string[i] = input.next();
        }
        input.close();

        //Write your code here
        for (int i = 1; i < numb; i++) {
            for (int j = i; j >= 1; j--) {

                if (new BigDecimal(string[j]).compareTo(new BigDecimal(string[j - 1])) > 0) {
                    String temp = string[j];
                    string[j] = string[j - 1];
                    string[j - 1] = temp;

                } else {
                    break;
                }
            }
        }


        //Output
        for (int i = 0; i < numb; i++) {
            System.out.println(string[i]);
        }
    }
}
