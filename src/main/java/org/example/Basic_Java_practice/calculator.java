package org.example.Basic_Java_practice;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        double num1,num2;
        String operator;
        Scanner sc = new Scanner(System.in);
        System.out.println("pls give your first number :- ");
        num1 = sc.nextDouble();
        System.out.println("pls give your second numbe :- ");
        num2 = sc.nextDouble();
        System.out.println("print put the operator to execute operation :- ");
        operator = sc.next();
        sc.close();
        switch (operator){
            case "+" :
                System.out.println(num1 + num2);
                break;
            case "-" :
                System.out.println(num1 - num2);
                break;
            case "*" :
                System.out.println(num1 * num2);
                break;
            case "/" :
                if (num2 == 0) {
                    System.out.println("invalid operation");
                }else{
                    System.out.println(num1 / num2);
                }
                break;
            case "%" :
                if (num2 == 0) {
                    System.out.println("invalid operation");
                }else{
                    System.out.println(num1 % num2);
                    break;
                }
            default :
                System.out.println("invalid operation");
                break;
        }

    }
}