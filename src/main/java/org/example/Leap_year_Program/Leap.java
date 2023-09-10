package org.example.Leap_year_Program;

import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        int year, Month;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("pls enter the value of month :-");
            Month = sc.nextInt();
            System.out.println("pls enter the value of year :-");
            year = sc.nextInt();
        }
        switch (Month) {
            case 1 -> {
                System.out.println("The month is January");
                System.out.println("The number of days in a month is 31 .");
            }
            case 3 -> {
                System.out.println("The month is March ");
                System.out.println("The number of days in a month is 31 .");
            }
            case 5 -> {
                System.out.println("The month is May");
                System.out.println("The number of days in a month is 31 .");
            }
            case 7 -> {
                System.out.println("The month is July");
                System.out.println("The number of days in a month is 31 .");
            }
            case 8 -> {
                System.out.println("The month is August");
                System.out.println("The number of days in a month is 31 .");
            }
            case 10 -> {
                System.out.println("The month is October");
                System.out.println("The number of days in a month is 31 .");
            }
            case 12 -> {
                System.out.println("The month is December ");
                System.out.println("The number of days in a month is 31 .");
            }
            case 4 -> {
                System.out.println("The month is April");
                System.out.println("The number of days in a month is 30 .");
            }
            case 6 -> {
                System.out.println("The month is June");
                System.out.println("The number of days in a month is 30 .");
            }
            case 9 -> {
                System.out.println("The month is September");
                System.out.println("The number of days in a month is 30 .");
            }
            case 11 -> {
                System.out.println("The month is November");
                System.out.println("The number of days in a month is 30");
            }
            case 2 -> {
                System.out.println("the month is february ");
                if (year % 4 != 0 && year % 400 != 0 && year % 100 != 0) {
                    System.out.println("and the days in this month is 28");
                } else {
                    System.out.println("and the days in this month is 29");
                    System.out.println("and it is a leap year");
                }
            }
            default -> {
                System.out.println("invalid month");
            }
        }
    }
}