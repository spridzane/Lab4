package com.Lab4;

public class StarWord2 {
    // Java StringBuffer class is used to create mutable (modifiable) string.
    // Lets say you typed something in Scanner, and you want to change in, so
    // StringBuffer classes are used for creating mutable/changeble string.
    // declare data members
    private String word;
    private StringBuffer starWord;

    public StarWord2() {
        word = new String();
        starWord = new StringBuffer();
    }

    //set method
    public void setWord(String word){
        this.word = word;
    }
    //compute methods
    //compute vowels
    public void computeVowels(){
        starWord = new StringBuffer();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'e' ||
                    word.charAt(i) == 'a' ||
                    word.charAt(i) == 'i' ||
                    word.charAt(i) == 'u' ||
                    word.charAt(i) == 'o'){
                starWord.append('*');
            }else{
                starWord.append(word.charAt(i));
            }
        }//end for
    }//end compute vowels method

    //compute stars method
    public void computeStars(){
        starWord = new StringBuffer();
        for(int i = 0; i < word.length(); i++){
            starWord.append('*');
        }
    }

    //compute PigLatin method
    public void computePigLatin(){
        starWord = new StringBuffer();
        for(int i = 1; i < word.length(); i++){
            starWord.append(word.charAt(i));
        }
        starWord.append(word.charAt(0));
        starWord.append('a');
        starWord.append('y');
    }

    //compute reverse word
    public void reverseWord(){
        starWord = new StringBuffer();
        for(int i = word.length()-1; i >= 0; i--){
            starWord.append(word.charAt(i));
        }
    }

    public String getStarWord(){
        return starWord.toString();
    }

}
