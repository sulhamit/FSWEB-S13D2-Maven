package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Boolean isPalindrome (int b){
        int a = Math.abs(b);

        int tersSayi =0;
           while(a!=0){
               int kalan = a%10;
               tersSayi = tersSayi*10+kalan;
                a = a /10;
           }
           return tersSayi == Math.abs(b);

    }


}
