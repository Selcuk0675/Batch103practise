package day10arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {
    /*
INTERWIEW QUESTIONS
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str=input.nextLine();

        //split burada split methoduyla parcaladim arraya cevirdim
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));//[a, l, i, c, a, n]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[a, a, c, i, l, n]
        int sayac=0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1].equals(arr[i])){
                sayac++;// eger herfler ayni ise bir artir
            }else {
                System.out.println(arr[i-1]+"  karakter sayisi  " +(sayac+1));
                sayac=0;//farkli karaktere gectigi icin sayaci sifirliiyoruz
            }
            if (i==arr.length-1) {
                System.out.println(arr[i]+"  karakterinin sayisi"+(sayac+1));
            }

        }




    }

}
