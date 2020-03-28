package com.Lab4;
//https://www.google.com/search?q=pig+Latin&safe=strict&sxsrf=ALeKk035J9FewDGZEVDKGq47tm4VqxYRiQ:1585160202936&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj9krv2nbboAhX18KYKHUbBBOYQ_AUoAXoECAwQAw&biw=1366&bih=629#imgrc=QfRjq3jvSQISsM

public class PigLatin {
    private String word;
    private String pig;
    private StringBuffer sb;

    public PigLatin(){ }

    public void setWord(String w){
        this.word = w;
    }

    public void translate(){
        sb = new StringBuffer();
        int i = 1;
        while (i < word.length()){
            char c = word.charAt(i);
            sb.append(c);
            i++;
        }//end while

        sb.append(word.charAt(0));
        sb.append("ay");
        pig = sb.toString();
    }

    public String getPig(){

        return pig;
    }
}
