package day04ifstatement.day05ifstatement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {

        //  Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
        // Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen 4 basmakli bir sayi giriiiniz");
        int sayi=input.nextInt();

        if (sayi<1000||sayi>9999){// İstenmeyeb durum incelendi
            System.out.println("lutfen 4 basmakli bir sayi giriniz");
        } else if (sayi%5==0) {//4 basmakli 5 ’etam bolunuyor

            if (sayi%10==0){
                System.out.println("5 e bolunebilen cift sayi");
            }else {
                System.out.println("5 e bolunebilen tek sayi");
            }


        }else {
            System.out.println("tekrar deneyin");// 4 basmakli 5 bolunmuyor
        }

    }
}
