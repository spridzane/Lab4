package com.Lab4;

public class Main {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("java2s.com");
        System.out.println("buffer before = " + sb);
        System.out.println("charAt(1) before = " + sb.charAt(1));
//from  ja  v  a 2 s  .c o  m
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after = " + sb);
        System.out.println("charAt(1) after = " + sb.charAt(1));

    }
}