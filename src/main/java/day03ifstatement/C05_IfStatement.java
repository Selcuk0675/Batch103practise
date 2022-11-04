package day03ifstatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {

        /*/Example: Kullnıcıdan alacaginiz iki sayiyi
         yine kullaniciya sectireceginiz dort işlemden birine koyup
         sonucu yazdirinniz

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen \n toplma islemi icin 1\n cıkarma islemi icin2\n bolme islemi icin3\ncarpma islemi icin");

        int islem=input.nextInt();// Kullanıcının islem terciği icin bir variable olusturduk

        System.out.println("iki tamsayi giriniz");// kullanıcıya bildirimde bulundum

        double num1=input.nextDouble();//1.sayi assign edildi
        double num2=input.nextDouble();//2.sayi assign edildi

        if (islem==1){
            System.out.println("toplama isleminin sonucu:"+num1+"+"+num2+"="+(num2+num1));

        } else if (islem==2) {
            System.out.println("cıkarma isleminin sonucu:"+num1+"-"+num2+"="+(num2-num1));


        } else if (islem==3) {
            System.out.println("bolme isleminin sonucu:"+num1+"/"+num2+"="+(num2/num1));


        } else if (islem==4) {
            System.out.println("carpma isleminin sonucu:"+num1+"*"+num2+"="+(num2*num1));


        }else {

            System.out.println("Hatalı giris yaptiniz");

        }

    }
}
