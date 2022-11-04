package day04ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gun=input.next().toLowerCase();
        if (gun.equals("cuma")){
            System.out.println("muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("yahudiler icin kutsal gun");

        }else if (gun.equals("pazar")) {
            System.out.println("hristiyanlar icin kutsal gun");
        }else {
            System.out.println("gecerli bir gun ismi giriniz");
        }
        //2.yol:

        String gun1=input.next().toLowerCase();

        if (gun1.equals("cuma")){
            System.out.println("muslumanlar icin kutsal gun");
        }if (gun1.equals("cumartesi")) {
            System.out.println("yahudiler icin kutsal gun");
        }if (gun1.equals("pazar")) {
            System.out.println("hristiyanlar icin kutsal gun");
        }
        if (!gun1.equals("cuma") && !gun1.equals("cumartesi")&& !gun1.equals("pazar")){
            System.out.println("kutsal gun degil");
        }
        //3.yol:

        String gun2=input.next();

        if (gun2.equalsIgnoreCase("cuma")){
            System.out.println("muslumanlar icin kutsal gun");
        }if (gun2.equalsIgnoreCase("cumartesi")){
            System.out.println("yahidi icin kutsal gun");
        }if (gun2.equalsIgnoreCase("pazar")){
            System.out.println("hristiyanlar icin kutsal gun");
        }

            if (!gun2.equalsIgnoreCase("cuma") && !gun2.equalsIgnoreCase("cumartesi") &&!gun2.equalsIgnoreCase("pazar") ){
                System.out.println("kutsal gun degil");
            }





        }
}
//package day04_IfStatement;
//
//        import java.util.Scanner;
//
//public class C03_IfStatement {
//
//    //Kullanicidan bir gun alin
//    // eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal  gun" yazdirin.
//    // "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin.
//    // "Pazar"  ise ekrana "Hiristiyanlar icin kutsal gun" yazdirin
//
//    public static void main(String[] args) {
//
//
//        //String'lerde == neden kullanilmaz.Onun yerine equals kullaniriz.
//        // Cunku Javda 2 tane memory var.Stack ve Heap.
//        // String 'de referans degerinede bakildigi icin == yerine equals kullanilir.
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen gun ismi giriniz");
//
//
//        //1.YOL
//      /*  String gun=input.next().toLowerCase();//toLowerCase==kucuk harf yapar
//
//        if (gun.equals("cuma")){
//            System.out.println("Muslumanlar icin kutsal gun");
//        }
//       if(gun.equals("cumartesi")){
//           System.out.println("Yahudiler icin kutsal gun");
//       }
//       if (gun.equals("pazar")){
//           System.out.println("Hristiyanlar icin kutsal gun");
//       }
//       if (!gun.equals("cuma") && !gun.equals("cumartesi")&& !gun.equals("pazar")){
//           System.out.println("Kutsal gun degil");
//       }*/
//
//        //2.YOL
//     /*   String gun = input.next();
//        if (gun.equalsIgnoreCase("cuma")){
//            System.out.println("Muslumanlar icin kutsal gun");
//        }
//        if (gun.equalsIgnoreCase("cumartesi")){
//            System.out.println("Yahudiler icin kutsal gun");
//        }
//        if(gun.equalsIgnoreCase("pazar")){
//            System.out.println("Hristiyanlar icin Kutsal Gun");
//        }
//        if (!gun.equalsIgnoreCase("cuma")&& !gun.equalsIgnoreCase("cumartesi")&& !gun.equalsIgnoreCase("pazar")){
//            System.out.println("Kutsal Gun Degil");
//        }*/
//
//        //3.YOL
//        String gun = input.next().toLowerCase();
//
//
//        if (gun.equals("cuma")) {
//            System.out.println("Muslumanlar icin kutsal gun");
//        } else if (gun.equals("cumartesi")) {
//            System.out.println("Yahudiler icin kutsal gun");
//        } else if (gun.equals("pazar")) {
//            System.out.println("Hristiyanlar icin kutsal gun");
//
//        } else  System.out.println("Kutsal Gun degil");
//
//
//    }
//
//
