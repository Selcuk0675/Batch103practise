package day04ifstatement.day05ifstatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
       // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
       // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input=new Scanner(System.in);

        System.out.println("lutfen cinsiyetinizi giriniz..."+"\n kadın icin K \n erkek icin E harfini giriniz...");
        char cinsiyet=input.next().toLowerCase().charAt(0);
        System.out.println("lutfen 0 ile 120 arasinda bir deger giriniz");
        double yas=input.nextDouble();

        if (cinsiyet=='k'){
            if (yas<0 || yas>120){
                System.out.println("lutfen dogru yas degerin giriiniz");
            } else if (yas>60) {
                System.out.println("emekli olabilirsin");

            }else {
                System.out.println("emekli olamazsin");
                System.out.println(65-yas+"calismalisın");
            }

        }else if(cinsiyet=='e'){
            if (yas<0 || yas>120){
                System.out.println("lutfen dogru yas degerin giriniz");




            }
            else if (yas>60) {
                System.out.println("emekli olabilirsin");

            }




        }else {
            System.out.println("lutfen gecerli bir harf giriniz");
        }



    }
}
//package day05_IfStatement;
//        import java.util.Scanner;
//public class C04_IfStatement {
//    //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
//    // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
//    // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen cinsiyetinizi yaziniz ..." + " \n Kadin icin K  \n Erkek icin E harfini giriniz ..");
//        char cinsiyet = input.next().toUpperCase().charAt(0);
//        System.out.println("Lutfen yasinizi giriniz ");
//        double yas = input.nextDouble();
//        if (cinsiyet == 'K') {
//            if (yas < 0 || yas > 120) {
//                System.out.println("Lutfen dogru yas degerini giriniz");
//            } else if (yas > 60) {
//                System.out.println("Emekli Olabilirsin ");
//            } else {
//                System.out.println("Emekli Olamazsin " + (60 - yas) + " calismalisin ");
//            }
//        } else if (cinsiyet == 'E') {
//            if (yas < 0 || yas > 120) {
//                System.out.println("Lutfen dogru yas degerini giriniz");
//            } else if (yas > 65) {
//                System.out.println("Emekli Olabilirsin");
//            } else {
//                System.out.println("Emekli Olamazsin " + (65 - yas) + " daha calismalisin");
//            }
//        } else System.out.println("Lutfen gecerli bir harf giriniz ...");
//    }
