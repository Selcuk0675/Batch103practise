package day01variables;

public class C02Variables {

    public static void main(String[] args) {

        // 1-Farklı uç data turunde varıable olusturun ve bunları yazdırın

        String okulIsmı="techpro";
        System.out.println("okulIsmı = " + okulIsmı);

        char ilkHarf='k';
        System.out.println("ilkHarf = " + ilkHarf);


        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //  isminiz : Ahmet Can
        //  soyisminiz : Ates
        //  seklinde yazdirin

        String isim="ahmet can";
        String soyIsim="ateş";

//3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int a=5;
        int b=6;
        System.out.println(a+b);

        int toplam=a+b;
        System.out.println("toplam = " + toplam);

        //4- Bir tamsayi ve bir ondalikli variable olusturun
        //bunlarin toplamini yazdirin


        int k=5;
        double l=1.2;
        System.out.println(k+l);

        //5 – char data turunde bir variable olusturun ve yazdirin


        char s='*';
        System.out.println("s = " + s);

        //6- bir tamsayi ile bir harfi toplayiniz

        int f=20;
        char harf='m';

        //1.Yol:
        int toplam1=f+harf;
        System.out.println("toplam1 = " + toplam1);

        //2.yol
        System.out.println("harf = " + (harf+f));//ASCII olarak yazdırır

    }


}
