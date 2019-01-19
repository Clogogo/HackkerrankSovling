package PersonalTask;

import java.util.Scanner;

public class PersonalTask {

    public static void main(String[] args) {
//        Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100.
// Store 1 and 100 in variables lowerbound and upperbound,
// so that we can change their values easily. Also compute and display the average.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Value : ");
        int value = scanner.nextInt();
        sumAverageRunningInt(value);
        sumAverRunn(value);
        sumAverRunn1(value);

    }

    public static void sumAverageRunningInt(int value) {

        double sum = 0;

        for (int i = 1; i <= value; i++) {
            sum += i;
        }
        double result = sum / value;
        System.out.println("Total sum of total Value = " + sum + " " + result);

    }

    public static void sumAverRunn(int value) {
        double sum = 0;
        double start = 1;
        double result = 0;
        while (start <= value) {
            sum += start;
            ++start;
            result = sum / value;
        }
        System.out.println("Total sum of total Value = " + sum + " " + result);

    }

    public static void sumAverRunn1(int value) {
        double sum = 0;
        double start = 1;
        double result = 0;
        do {
            sum += start;
            ++start;
            result = sum / value;
        } while (start <= value);
        System.out.println("Total sum of total Value = " + sum + " " + result);
    }
}

