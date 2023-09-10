package org.example;

import java.util.Scanner;

public class average {
    public static double PrintAverage(double a,double b, double c){
        double sum = a+b+c;
        double avg = sum/3;
        System.out.println(avg);
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number :- ");
        double a = sc.nextDouble();
        System.out.println("please enter second number :- ");
        double b = sc.nextDouble();
        System.out.println("please enter third number :- ");
        double c = sc.nextDouble();
        System.out.println("the answer for your question is :-  ");
        double avg = PrintAverage(a, b, c);
    }
}
