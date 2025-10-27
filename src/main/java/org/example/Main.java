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
    public static String numberToWords (int sayi){
        if(sayi<0){
            return "Invalid Value";
        }
        String toWords="";
        String sayiString = String.valueOf(sayi);
        for(int i = 0; i<sayiString.length(); i++){
            char rakam = sayiString.charAt(i);


        switch(rakam){
            case '0':
              toWords += "Zero ";
                break;

            case '1':
                toWords += "One ";
                break;
            case '2':
                toWords += "Two ";
                break;
            case '3':
                toWords += "Three ";
                break;
            case '4':
                toWords += "Four ";
                break;
            case '5':
                toWords += "Five ";
                break;
            case '6':
                toWords += "Six ";
                break;
            case '7':
                toWords += "Seven ";
                break;
            case '8':
                toWords += "Eight ";
                break;
            case '9':
                toWords += "Nine ";
                break;
            default:
                return "Invalid value";

        }
        }


        return toWords.trim();

    }


}
