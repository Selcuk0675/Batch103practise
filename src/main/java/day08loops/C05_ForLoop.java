package day08loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*
  Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
  tekrarlayan kodu yaziniz

 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String  kelime=input.nextLine();

        System.out.println("kac kera tekrarlanmasini istiyorsu");
        int tekrarSayisi=input.nextInt();

       String ilkSonHarf= kelime.substring(0,1)+kelime.substring(kelime.length()-1);
       // not hangi karakteri istiyorsak onu substringle aliyoruz

        String cikti=""; // Stringin 0 i default deger   sonucu etkilemeyen deger
        for (int i=1;i<=tekrarSayisi;i++){
            cikti=cikti+ilkSonHarf;

        }
        System.out.println(cikti);



    }
}
