package org.example.Basic_Java_practice;

import java.util.Scanner;

public class Sitch {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
      /* if(button==1){
                System.out.println("hello");
            }else if(button==2){
                System.out.println("namaste ");
            }else if(button==3){
                System.out.println("bounjour");
            }else{
                System.out.println("invalid button ");*/
            switch (button) {
                case 1 -> System.out.println("namaste");
                case 2 -> System.out.println("hello");
                case 3 -> System.out.println("bounjour");
                default -> System.out.println("invalid button");
            }
        }
    }
}
