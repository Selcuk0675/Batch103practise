package day12_localdatetimeVarargsOverloadingOverriding;

import java.util.Scanner;

public class C01_LocalDatTime {

   // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yaziniz
    // BUNU İF LERLE YAPACAZ
   public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
       System.out.println("dogdugunuz ayi giriniz...");
       String ay=input.nextLine();

       System.out.println("dogdugunuz gunu giriniz...");
       int gun=input.nextInt();

       String burc="";
       if(ay.equalsIgnoreCase("Ocak")){
           if (gun>22)
               burc="kova";
       }else
           burc="oglak";
   }



}
