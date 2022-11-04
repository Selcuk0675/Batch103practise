package day07stringmanipulation;

import java.util.Scanner;

public class C06_StringManipulatonLength {
    public static void main(String[] args) {

        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */
        String cumle="Bugun hava yagmurlu";
        System.out.println(cumle.length());

        String str1="";//hiçligin uzunlugu 0 dir
        System.out.println(str1.length());//0

        String str2=" ";
        System.out.println(str2.length());//1

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner input=new Scanner(System.in);
        System.out.println("isim ve soyisminizi giriniz");
        System.out.println("isminiz?");
        String isim=input.next();

        System.out.println("soyisminiz?");
        String soyismin=input.next();

        if (isim.length()>soyismin.length()){
            System.out.println("isminiz soyisminizden uzun");

        } else if (isim.length()==soyismin.length()) {
            System.out.println("soyisminiz isminize esittir");

        }

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String str=input.next();
        System.out.println(str.length());

        if (str.length()==4){

            char bir=str.charAt(0);
            char iki=str.charAt(1);
            char uc=str.charAt(2);
            char dort=str.charAt(3);
            System.out.println("tersten yazilmis hali:" +dort+uc+iki+bir);
        } else System.out.println("yanlis giris yaptiniz");





    }
}
