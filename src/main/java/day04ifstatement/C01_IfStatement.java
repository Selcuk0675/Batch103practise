package day04ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen Y/N harflerinden bir tanesini giriniz");
        char karakter=input.next().charAt(0);

        if (karakter=='y' || karakter== 'Y'){
            System.out.println("yes");
        } else if (karakter=='n'|| karakter=='N') {
            System.out.println("no");
        }else {
            System.out.println("lutfen gecerli bir harf girin");

        }




    }
}
