package day04ifstatement.day05ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {


// Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen yasınızı giriniz");
        int yas=input.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else {
            System.out.println("emekli olamazsin");
            System.out.println(65-yas+"  sene daha calismalisin");
        }
        //nested if else
        if (yas>0){
            if (yas>=65){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olamazsin");
                System.out.println(65-yas+"  sene daha calismalisin");}// DİKKAT:burda ifadeyi yazdirmak icin 2, sout yaptik
        }else {
            System.out.println("lutfen sıfırdan buyuk bir sayi giriniz");
        }



    }
}
