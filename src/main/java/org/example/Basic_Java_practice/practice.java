package org.example.Basic_Java_practice;

import java.util.ArrayList;

public class practice {
    public static void main(String[] args){
        ArrayList<String> utensils = new ArrayList<String>();
        utensils.add("knife");
        utensils.add("spoons");
        utensils.add("glassof water ");
        utensils.add("plate");
        utensils.add("bottle");
        for (int i=0;i<5;i++){
            System.out.println(utensils.get(i));
        }
//        

    }
}
