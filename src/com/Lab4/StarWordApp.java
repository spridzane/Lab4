package com.Lab4;

import java.util.Scanner;
public class StarWordApp {
    public static void main(String[] args) {
        //declare local variables
        String word;
        int method;
        String starred;
        String methods;
        String ans = "y";
        //declare objects - scanner and StarWord class
        Scanner sc = new Scanner(System.in);
        StarWord sw = new StarWord();
        //System.out.println("Please enter a word:");
        //word = sc.next();

        //input
        while (ans.equals("y")){
            System.out.println("Please enter a word: ");
            word = sc.next();
            sw.setWord(word);
            //"Please choose which method to use" (Switch Case or IF Else) while choose the right number
            System.out.println("Please choose which method to use:" +
                    " 1 - Vowels method," +
                    " 2 - Stars method," +
                    " 3 - PigLatin method," +
                    " 4 - Reverse method. ");
            method = sc.nextInt();
            sw.setMethod(method);
            //process
            if (method == 1){
                sw.computeVowels();
            }else if (method == 2){
                sw.computeStars();
            }else if (method == 3){
                sw.computePigLatin();
            }else if (method == 4){
                sw.computeReverseWord();
            }else{
                    System.out.println("Please enter one of suggested numbers!");
            }
            starred = sw.getStarredWord();
            methods = sw.getMet();
            if (method >= 1 && method <=4){
                //output
                // "The word: + word + with STARRED compute method is + starredWord
                // "Do you wish to continue?" y/n
                System.out.println("the word " + word + " with " + methods + " is " + starred);
                System.out.println("Do you wish to continue(y / n) ?");
                ans = sc.next();
                ans = ans.toLowerCase();
                }
        } //end while
        System.out.println("Program is finished.");

    }//end main

}//end class

