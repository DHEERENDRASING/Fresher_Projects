package org.example;

import java.util.Scanner;

public class VideoGameSurvey {
    //non-main method

    private static void gamerpercentagelikeme(String[] args) {

        int correct;
    }


    //main method below
    public static void main(String[] args) {
        boolean run = true;
        while (run) {

            System.out.println("WELCOME TO THE GRAND SURVEY OF VIDEOGAMES!");
            System.out.println("");

            Scanner keyboard = new Scanner(System.in);

            //Q1
            System.out.println("Question 1: Do you like Videogames? (Please answer Yes or No)");
            String input = keyboard.nextLine();
            if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Yeah") || input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("YES!")) {
                System.out.println("Awesome!");
            } else {
                System.out.println("Wow. You have no sense of fun.");
            }
            //Q2
            System.out.println("");
            System.out.println("Question 2: What types of videogames do you play?(Please use abbreviated froms of games such as FPS, MMO, RPG etc).");
            String input2 = keyboard.nextLine();
            if (input2.equalsIgnoreCase("Fps")) {
                System.out.println("Fantastic! Me too!");
            } else {
                System.out.println("OK, thats cool!My favorite is FPS.");
            }
            //Q3
            System.out.println("");
            System.out.println("Question 3:Do you like Singleplayer or Multiplayer games? ");
            String input3 = keyboard.nextLine();
            if (input3.equalsIgnoreCase("Singleplayer") || input.equalsIgnoreCase("S") || input.equalsIgnoreCase("SP")) {
                System.out.println("Me Too!!");
            } else {
                System.out.println("Rad! My favorite is Singleplayer. ");
            }
            //Q4
            System.out.println("");
            System.out.println("Question 4: What do you like in a videogame");
            String input4 = keyboard.nextLine();
            if (input4.equalsIgnoreCase("I dont play games") || input.equalsIgnoreCase("None") || input.equalsIgnoreCase("N")) {
                System.out.println("You are sooooo boring.");
            } else {
                System.out.println("Awesome! What I like in a videogame is solid gameplay, great graphics and immersive audio...but most of all, IT HAS TO BE FUN!!");
            }
            //Q5
            System.out.println("");
            System.out.println("Question 5: What is your ALL-TIME favorite videogame?");
            String input5 = keyboard.nextLine();
            if (input5.equalsIgnoreCase("Skyrim")) {
                System.out.println("Really?! ME TOO!");
            } else {
                System.out.println("Great! My personal favorite is SKYRIM!");
            }
            System.out.println("");
            System.out.println("THANK YOU FOR TAKING THE GRAND SURVEY OF VIDEOGAMES!");
            System.out.println("");
            System.out.println("Would you like to take the survey again? (Please answer with Yes or No: Case sensitive)");
            String input6 = keyboard.nextLine();
            if (input6.equalsIgnoreCase("No")) {
                break;
            } else {
                System.out.println("Okay! The Survey will restart shortly.");
                System.out.println("");
                System.out.println("");


            }
        }
    }
}