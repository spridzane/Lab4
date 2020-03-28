package com.Lab4;

public class StarWord {
    //declare data members
    private String word;
    private String starredWord;
    private int method;
    private StringBuffer sb;
    int len;
    //int length = word.length();

    //constructor
    //put StringBuffer inside the constructor
    //sc
    public StarWord(){
        sb = new StringBuffer();
    }

    //setMethod
    public void setWord(String w){
        this.word = w;
    }

    public void setMethod(int m){
        this.method = m;
    }

    //compute methods
    //computeVowels
    public void computeVowels(){
        len = word.length();
        //vowels: a = 1, e = 5, i = 9, o = 15 and u = 21
        for (int i = len-1; i >= 0; i--){
            //retrieve the char from the word located at the index i, and store in the variable l
            char l = word.charAt(i);
            if (l == 'a' || l == 'A'){
                sb.append(1);
            }else if (l == 'e' || l == 'E'){
                sb.append(5);
            }else if (l == 'i' || l == 'I') {
                sb.append(9);
            }else if (l == 'o' || l == 'O') {
                sb.append(15);
            }else if (l == 'u' || l == 'U') {
                sb.append(21);
            }else{
                sb.append(l);
            }
        }//for
        starredWord = sb.toString();
        sb.setLength(0);
    }//end Vowels

    //computeStars
    public void computeStars() {
        len = word.length();
        for (int i = 0; i < len; i++){
            char letter = word.charAt(i);
            sb.append("*");
        }
        starredWord = sb.toString();
        sb.setLength(0);
    } //end stars
    //computePigLatin
    public void computePigLatin(){
        int i = 1;
        while(i < word.length()){
            char c = word.charAt(i);
            sb.append(c);
            i++;
        } //end while
        sb.append(word.charAt(0));
        sb.append("ay");
        starredWord = sb.toString();
        sb.setLength(0);

    }
    //reverse word
    public void computeReverseWord(){
        for (int i = word.length() - 1; i >= 0; i--){
            //retrieve the letter from an index i
            char w = word.charAt(i);
            sb.append(w);
        }
        starredWord = sb.toString();
        sb.setLength(0);
    }

    public String getMet(){
        String met;
        switch (method){
            case 1:
                met = "Vowels method";
                break;
            case 2:
                met = "Stars method";
                break;
            case 3:
                met = "Pig Latin method";
                break;
            case 4:
                met = "Reverse method";
                break;
            default:
                met = "Incorrect input";
        }
        return met;
    }

    public String getStarredWord(){

        return starredWord;
    }
    //.toString()

}
