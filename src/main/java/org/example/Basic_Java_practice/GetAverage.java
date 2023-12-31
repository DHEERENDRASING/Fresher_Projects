package org.example.Basic_Java_practice;

import java.util.Scanner;

public class GetAverage {

    public GetAverage() {
        String getStr = getUserNums();
        double result = userAvg(getStr);
        printAverage(result, getStr);

    }

    public String getUserNums() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter five to ten numbers separated by spaces: ");
        return in.nextLine();
    }

    public static double userAvg(String str) {
        String[] arr = str.split(" ");
        double sum = 0.0;
        double average = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        if (arr.length > 0) {
            average = sum / arr.length;
        }

        return average; // how do I get the program to count what to divide by since user can input 5- 10?
    }

    public static void printAverage(double average, String userNumInput) {
        System.out.printf("The average of the numbers " + userNumInput + "is %.2f", average);

    }

    public static void main(String[] args) {
        new GetAverage();

    }
}