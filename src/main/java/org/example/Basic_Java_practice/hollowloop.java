package org.example.Basic_Java_practice;

import java.util.Scanner;

public class hollowloop {
    public static void main(String[] args) {
        int N, M;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            M = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (i == 1 || j == 1 || i == N || j == M) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
