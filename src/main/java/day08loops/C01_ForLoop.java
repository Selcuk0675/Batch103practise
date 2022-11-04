package day08loops;

import java.util.Scanner;

public class C01_ForLoop {

    public static void main(String[] args) {


         //Kullanicidan baslangic , bitis ve artis miktarini alarak
         // aradaki tum sayilari aralarina virgul koyarak yazdirin

       // Scanner input=new Scanner(System.in);
      //  System.out.println("lutfen baslangic bitis ve artis miktarini giriniz");


        int baslangic=10;
        int bitis=50;
        int artisMiktari=5;
       //  for (int i=10;i<51;i=i+5){  boyle yapsak dinamik kod olmaz di asgidaki dinamik kod olodu
             for (int i=baslangic;i<=bitis;i=i+artisMiktari){
                 if (i<bitis){
                     System.out.println(i+",");  // Bu kismi son sayinin onundeki virgulu kaldirmak icin yaptikm
                 }else System.out.println(i);





         }




    }
}
