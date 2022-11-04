package day04ifstatement.day05ifstatement;

import java.util.Scanner;

public class C07_İfStatement {
    public static void main(String[] args) {
        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        //ve dikdortgenin kare olup  olmadigini yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen birinci kenar uzunlugunu giriniz");
        int kanar1=input.nextInt();

        System.out.println("lutfen ikinci kenar uzunlugunu giriniz");
        int kanar2=input.nextInt();

        if (kanar2==kanar1){
            System.out.println("bu bir karedir");
        }else System.out.println("kare degildir");

    }
}
