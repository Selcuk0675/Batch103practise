package day02variables;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi=input.next();//next i seçersek ilk kelimeyi alir

        //Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanını hesaplatan bir program yazdirin

        System.out.println("yaricapi giriniz");
        double r=input.nextDouble();
        System.out.println("Cemberin cevresi= "+2*314*r/100);
        System.out.println("Dairenin alanı= "+3.14*r*r);

        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
// cevre hesabini yapan bir program yaziniz.
        System.out.println("kısa kenarı giriniz");
        System.out.println("uzun kenarı giriniz");
        double n=input.nextDouble();
        double m=input.nextDouble();
        System.out.println("cevre=  "+2*(m+n));
        System.out.println("aln=  "+m*n);


        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
// Ucgenin cevresi=a+b+c

        System.out.println("kenar uzunlukları giriniz");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double cevre=a+b+c;
        System.out.println("cevre=  "+cevre);

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */
        System.out.println("bir harf giriniz");
        char harf=input.next().charAt(0);
        System.out.println("  "+harf+"  ");
        System.out.println(" "+harf+"  "+harf+" ");
        System.out.println(harf+" "+harf+"  "+harf+"");

    }

}
