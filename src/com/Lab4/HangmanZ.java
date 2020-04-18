package com.Lab4;

import java.util.Scanner;

public class HangmanZ {
    public static void main(String[] args) {
        String word = "zigmars";
        //String usedLetters = "";
        char letter;


        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(" ");

//        for(int i = 0; i < word.length(); i++){
//            sb.append("*");
//        }
//        System.out.println(sb.toString());
//        do {
//            System.out.println("Please enter a letter: ");
//            letter = sc.next().charAt(0);

//            int lives = 5;
//            boolean guessedLetter;
//                for (int i = 0; i < word.length(); i++) {
//
//                    if (letter == word.charAt(i)) {
//                        sb.setCharAt(i, letter);
//                    }
//                }
//                System.out.println(sb.toString());
//
//
//        }while(sb.toString().contains("*"));

        String usedLetters = " ";
            //int length = letters.length();
            for(int i = 0; i <=26; i++ ){
                System.out.println("Please enter a letter: ");
                letter = sc.next().charAt(0);
                letter = Character.toUpperCase(letter);
                if(usedLetters.contains(String.valueOf(letter))){
                    System.out.println("Letter is already used");
                }else{
                    usedLetters = String.valueOf(sb.append(letter + " "));
                    System.out.println("Letters used: " + sb.toString());
                }

                }

        }//end main


    }//end class

