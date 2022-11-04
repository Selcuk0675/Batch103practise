package day03ifstatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

        char harf='a';
        char harf2='A';
        System.out.println("harf>harf2==>"+(harf>harf2));
         //Not:Karsilastirma islemlerin sonucu boolean true ya da false doner
        // Buyuk harflerin ASCİİ degerleri kucuk harflerinkinden kucuktur
        
        //1)Herhangi bir char variablenin ascii degerini kod yazarak bulunuz
        
        //1.Yol
        
        char space=' ';
        System.out.println("space'in ASCII degeri:"+(space+0));//32
        //Spcenin ASCİİ degerini hesaplamak icin toplamaya etkisi olmayan "0"seceriz
        //boylece yazdırdıgımız degerbize spacenin ascii degerini verir

        char m='m';
        System.out.println("m'nin ASCII degeri:"+(m+0));//109

        //2.Yol

        int harf3='m';//char larda Java char karaktere int atayabiliriz.Cunku charın bir resim karakteri,birde matamatiksel ascii degeri vardir bu nedenle ascii degerlerini hesaplatabiliriz

        System.out.println("m'nin ASCII degeri = " + harf3);

        byte b1=12;//kıyaslamasını yapınız buyukmudur
        byte b2=-125;
        System.out.println("b1>b2==>"+(b1>b2));


        float f1=2.45645f;
        float f2=5.86786f;
        System.out.println("f1>f2==>"+(f1>f2));//falsed

        System.out.println("b1>f1==>"+(b1>f1));//true

        long lng1=45464646l;
        System.out.println("b1<lng1==>"+(b1<lng1));//true

        char ch='h';
        System.out.println("b1>ch==>"+(b1>ch));//false

        
    }
}
