package day07stringmanipulation;

public class C03_StringManipulationReplace {

    public static void main(String[] args) {
           /*replace()
  Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
  Sonuc String'dir..
      */

       /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space tum bosluklar
    \\S   ==> space disindaki hersey  */




            //rakam haricindekileri silin

        String str1="$45.99";
        System.out.println(str1.replaceAll("\\D",""));//4599

            // Verilen cumleyi  * ile gizleyin, 10 karakterden sonrasini yazdirin

        String cumle="Her dert Java gibi olsa";
        System.out.println(cumle.replaceAll("\\w","*")+cumle.substring(10));

            //a harfini @ isareti ile degistir
            String ders="olaganustu";
        System.out.println(ders.replaceAll("a","@"));




            /** ReplaceFirst
             * Replace ile aynı sadece ilk bulunan karakteri değiştirir
             */
            String txt = "Merhaba Dunya";

            //txt'deki butun 'a' lari 'e' ile degistirin
        System.out.println(txt.replaceAll("a","e"));



        //txt'deki ilk bulunan 'a' yi 'e' ile degistirin
        System.out.println(txt.replaceFirst("a","e"));



     /* replaceAll()
       Metin icerisindeki bir dizi kumesini degistirme .Sonuc String'dir..

      */
            //bir dizi kumesini degistirme>>>> Kalem yerine biber yazdirin
            String str="Dolma Kalem";


        System.out.println(str.replaceAll("Kalem","Biber"));





          /*
       contains()
       Metin icerisinde arama yapmamizi saglar.
       bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
       Sonuc boolean dir.

       equals()
       2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

       equalsIgnorecase()
       equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
      */

            String str3 = "Merhaba";
            String st = "Merhaba";

            boolean birebiresitMi=str3.equals("Merhaba");//true
        System.out.println(birebiresitMi);// burada ister kiyas yapariz ister yazariz
        System.out.println(str3.equals(st));//true
        System.out.println(str3.equalsIgnoreCase("Merha"));//false
        System.out.println(str3.equals("merha"));//falsed

    }
}
