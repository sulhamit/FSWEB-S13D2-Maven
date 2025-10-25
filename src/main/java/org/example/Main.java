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

    public static Boolean isPerfectNumber(int sayi){
        if(sayi<1){
            return false;
        }
        int toplam=0;
        for(int i =1; i<sayi; i++){
            if(sayi%i == 0){
                toplam = toplam+i;
            }
        }
        return toplam == sayi;
    }




}
