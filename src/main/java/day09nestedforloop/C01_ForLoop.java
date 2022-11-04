package day09nestedforloop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {


/*
   Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
*/

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir String ifade giriniz");
        String str=input.nextLine();//

        int sayac=0;// bı soruda sayı varsa kac tane diyosa mutlaka sayac kulşlaniriz

        for (int i=0;i<str.length(); i++){// İfademiz String oldugu icin i=0 dan basladik
            if(str.charAt(i)=='a'){
                sayac++;

            } else if (str.charAt(i)=='c') {
                break;

            }
        }

        System.out.println("c oncesi a larin sayisi  "+sayac);
        // not : bu kod ilk c den onceki a larin sayisini bulur digerlerine karismaz

    }
}
