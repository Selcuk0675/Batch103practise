package day11_multidimensionelarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_Fibonacci {
     /*
    INTERWIEW
   Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("lutfen bir sayi giriniz");
         int sayi=input.nextInt();

         List<Integer>Fibonacchi=new ArrayList<Integer>();
         Fibonacchi.add(0);
         Fibonacchi.add(1);
         int i=1;
         if (sayi<=1){
             System.out.println("lutfen 1 den buyuk bir  sayi giriniz");
         }else {
             while (Fibonacchi.get(i)<sayi){

                 Fibonacchi.add(Fibonacchi.get(i)+Fibonacchi.get(i-1));// get(i) i inci index
                 i++;//Bir basamak ilerlesin diye i++ yaptik

             }
             if (Fibonacchi.get(Fibonacchi.size()-1)>sayi){//Fibonacchi de yer almiyorsa
                 Fibonacchi.remove(Fibonacchi.size()-1);//Son elemani sil

                 System.out.println("Girdiigniz sayi fibonacchi de yer almiyor.Girirlen sayiya kadar ki fibonacchi"+Fibonacchi);

             }else {
                 System.out.println("Girdiigniz sayi bir fibonacchi sayisidir"+Fibonacchi);
             }
         }



















     }

}
