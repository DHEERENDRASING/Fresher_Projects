package org.example.Basic_Java_practice;

import java.util.Scanner;

public class functionpractice{
    public static void PrintName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        PrintName(name);
    }
    }