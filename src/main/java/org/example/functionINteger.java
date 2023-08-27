package org.example;

import java.util.Scanner;

public class functionINteger {
    public static int LetsMultiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please give first input :- ");
            int a = sc.nextInt();
        System.out.println("please inter second input :- ");
            int b = sc.nextInt();
        System.out.println("the answer for your input is :- " + LetsMultiply(a,b));
        }
    }