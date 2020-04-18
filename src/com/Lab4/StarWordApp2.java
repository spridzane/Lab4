package com.Lab4;

import java.util.Scanner;

public class StarWordApp2 {
    public static void main(String[] args) {
        //declare local variables
        String word, starredWord;
        int choice = 0;
        char rep;

        //declare objects
        Scanner input = new Scanner(System.in);
        StarWord2 myStarWord = new StarWord2();

        //input
        do{
            word = new String();
            System.out.println("Please enter a word");
            word = input.next();
            word = word.toLowerCase();
            myStarWord.setWord(word);

            do{
                System.out.println("Please choose which method to use \nStars = 1\nVowels = 2\nPiglatin = 3\nReverse Word = 4");
                choice = input.nextInt();
                switch (choice){
                    case 1:
                        myStarWord.computeVowels();
                        break;
                    case 2:
                        myStarWord.computeStars();
                        break;
                    case 3:
                        myStarWord.computePigLatin();
                        break;
                    case 4:
                        myStarWord.reverseWord();
                        break;
                    default:
                        System.out.println("Please enter one of the numbers suggested!");
                }
            }while(choice != 1 && choice != 2 && choice != 3 && choice != 4);

            //process
            //output
            starredWord = myStarWord.getStarWord();

            System.out.println("The word: " + word + " with STARRED compute method is " + starredWord);
            System.out.println("Do you wish to continue? y/n ");
            rep = input.next().charAt(0);
        }while(rep == 'y');

    }//end main
}//end class
