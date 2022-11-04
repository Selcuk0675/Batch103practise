package day04ifstatement.day05ifstatement;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class C01_IfStatatement {
    public static void main(String[] args) {

        /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandirSc*/

          Scanner input=new Scanner(System.in);
          System.out.println("Lutfen birinci sayi giriniz");
          double sayi1=input.nextDouble();
        System.out.println("Lutfen ikinci sayi giriniz");
        double sayi2=input.nextDouble();

        if (sayi2>0 && sayi2>0){
            System.out.println(sayi1+sayi2);
        } else if (sayi1 < 0 && sayi2 < 0)

        {
            System.out.println(sayi2*sayi1);
        } else if(sayi1*sayi2 < 0) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");

        } else if (sayi1==0 || sayi2==0) {
            System.out.println("sifir carpmaya gore yutan elemandir" );

        }


    }
}
