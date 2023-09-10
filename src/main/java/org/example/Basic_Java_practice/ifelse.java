package org.example.Basic_Java_practice;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float age = sc.nextFloat();
            if(age>=18){
                System.out.println("you are adult :");
            }else{
                System.out.println("you are not adult even you should watch pogo:");
            }
        }
    }
}
