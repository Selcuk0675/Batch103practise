package day09nestedforloop;

import java.util.Scanner;

public class C06_WhileLoop {

    /*
      kullanicidan toplanmak uzere sayilar isteyin
      sayi adedi 10 u gecerse yada toplami 500 u gecerse
      bu kadar sayi yeter ,,,adet sayi girdiniz toplami .. yazdirin

     */


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
       // System.out.println("lutfen toplanmak uzere sayi giriniz");
        // bunu forloop un dısına bırakirsak bunu bi ker eyazdirif

        int sayi=0;
        int toplam=0;
        int sayac=0;// adfet varsa sayac yazmaliyiz

        while (sayac<10&&toplam<500){
            System.out.println("lutfen toplanmak uzere sayi giriniz");
            sayi=input.nextInt();
            toplam=toplam+sayi;
            sayac++;

        }
        if (toplam>500){
            System.out.println(sayac+" adet sayi girdiniz.oplami  "+toplam);
        }else System.out.println("bu kadar sayi yeter "+sayac+"adet sayi girdiniz.toplami "+toplam);

    }


}
