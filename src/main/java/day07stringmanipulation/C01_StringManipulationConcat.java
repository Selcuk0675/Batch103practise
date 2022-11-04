package day07stringmanipulation;

import java.util.Scanner;

public class C01_StringManipulationConcat {
    public static void main(String[] args) {

          /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     */




            System.out.println(15 + 20 + "Merhaba");//35Merhaba
            System.out.println("Merhaba" + 15 + 20);//Merhaba1520
            System.out.println("Merhaba" + (15 + 20));//Merhaba35
            System.out.println("Merhaba" + 15 * 20);//Merhaba300

            //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
            //tam isminin buyuk harfle yazilmasini saglayin.

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ad ve soyadınızı giriniz");
        String isim=input.nextLine(),soyIsim=input.nextLine();
       //String soyIsim=input.nextLine();
        
        String tamisim=isim.concat(" "+soyIsim).toUpperCase();
        System.out.println("tamisim = " + tamisim);

    }
}
