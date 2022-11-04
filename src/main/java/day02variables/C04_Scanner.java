package day02variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz
        Scanner input=new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz");
       int sayi=input.nextInt();

       //Bir sayının birler basamagindaki rakamı %10 ile hesaplatabiliriz.

        int sonrRakam=sayi%10;
        int ilkRakam=sayi/1000;
        System.out.println("ilk rakam+ son rakam=="+(ilkRakam+sonrRakam));

        //Soru2:Kullanıcıdan uc basamaklı birf sayı alin ve sayinin rakamlarini birler,onlarve yuzler basamagi olarak yaxdırfın
        /*
        ornek: Input:853
        output:Girdiginiz sayinin birler basamagi:3
               Girdiginiz sayinin birler basamagi:5
               Girdiginiz sayinin birler basamagi:8

         */
        System.out.println("uc basamakli bir sayi giriniz");
        int sasyi2=input.nextInt();

        //Birler basamagindaki sayiyi bulalalim
        //sayi2==sayi/10

     int birler=sasyi2%10;
        System.out.println("girdiginiz sayinin birler basamagi=="+birler);

     //sayi=sayi/10;
        sasyi2/=10;//sayiyi iki basamaklı yapmak için 10 a boluyoruz
        System.out.println("ikibas="+sasyi2);//Bunu yazmasakta olur sadece terminalde bunu gormek icin yaptik

        //2) onlaR basamagındakı sayiyi bulalim
        int onlar=sasyi2%10;
        System.out.println("girdiginiz sayinin onlar basamagı"+onlar);
       sasyi2=sasyi2/10;

        //3) 100 ler basamagi

        int yuzler=sasyi2;
        System.out.println("girdiginiz sayinin yuzler basamagi=="+yuzler);

















        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12


        System.out.println("bes basamaklı bir sayi giriniz");
        int num=input.nextInt();
        int ilkikirakam=num/1000;
        System.out.println("ilkikirakam = " + ilkikirakam);
        int ilkikitop=(ilkikirakam%10)+(ilkikirakam/10);
        System.out.println("ilkikitop = " + ilkikitop);

        int sonikirakam=num%100;
        System.out.println("sonikirakam = " + sonikirakam);//45
        int sonikitop=(sonrRakam%10)+(sonikirakam/10);//5+4
        System.out.println("sonikitop = " + sonikitop);
        int toplam=ilkikitop+sonikitop;
        System.out.println("toplam = " + toplam);
        

        

    }
}
