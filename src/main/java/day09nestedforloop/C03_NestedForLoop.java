package day09nestedforloop;

import java.util.Scanner;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
    /* tac uzunlugu -> 6 iken

       ^
       ^^
       ^^^
       ^^^^
       ^^^^^
       ^^^^^^
       |||
       |||
       |||
       |||
       |||


*/
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen agacin tac uzunlugunu giriniz");
        int tacUzunlug = input.nextInt();

        String yaprak="";// default deger


        for (int i=0; i<tacUzunlug;i++){

               yaprak += "^";
                System.out.println(yaprak);

               }
        for (int i=0;i<6;i++){// bunlar bagimsiz olduklari icin ikisinin degeri de i
            System.out.println("|||");
        }


    }
}
