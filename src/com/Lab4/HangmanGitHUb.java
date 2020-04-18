package com.Lab4;

import java.util.Scanner;

public class HangmanGitHUb {
    public static void main(String[] args) {
        System.out.println("Enter Secrect Word");
        Scanner scn=new Scanner(System.in);
        String secrectStr = scn.next();
        StringBuilder b=new StringBuilder(secrectStr.length());
        for(int i=0;i<secrectStr.length();i++)
            b.append("*");
        char[] secrectStrCharArr=secrectStr.toCharArray();
        int charCnt=secrectStr.length();
        while(charCnt>=0){
            System.out.println("Secrect Word :"+b.toString());
            System.out.println("Guess a letter :");
            char guessChar = scn.next().toCharArray()[0];
            for(int i=0;i<secrectStrCharArr.length;i++){
                if(guessChar==secrectStrCharArr[i])
                    b.setCharAt(i,guessChar);
            }
        }

    }
}