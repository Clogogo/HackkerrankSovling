package PersonalTask;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double interestRate;
        int numberOfPayments;
        double principal;


        while (true) {
            double answer = input.nextDouble();
            if (answer > 1000) {
                if (answer < 1000000) {
                    principal = answer;
                    break;
                }
            }
            System.out.println("Enter Again");
        }
        while (true) {
            double interest = input.nextDouble();
            if (interest > 0) {
                interestRate = interest;
                break;
            }
            System.out.println("Enter Number greater than 0");
        }
        while (true) {
            int ans = input.nextInt();
            if (ans >= 1) {
                if (ans <= 30) {
                    numberOfPayments = ans;
                    break;
                }

            }
            System.out.println("Enter Number greater than 0");
        }


        double monthlyInterest = (interestRate / 100) / 12;


        double mortgage = principal * Math.pow(1 + interestRate, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);


        System.out.println(mortgage);


    }
}


