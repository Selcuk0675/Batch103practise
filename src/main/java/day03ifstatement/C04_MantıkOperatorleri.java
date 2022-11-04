package day03ifstatement;

public class C04_MantıkOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);//False
        boolean sonuc1=5>4 && 6+3==9 &&5+2!=8;
        System.out.println("sonuc1 = " + sonuc1);//true
        boolean sonuc2=5>4&7>9&6+3==9&5+2!=8;
        System.out.println("sonuc2 = " + sonuc2);//false

        int sayi1=15;
        // sayi1!un 10 ile 20 araliginda true diyerek dondurelim
        // 10<sayi1<20 Java uclu karsılastırma yapmaz
        // Ikılı karsılastırma yapip Mantiksal oparetorlerle birlestirelim

        System.out.println(10<sayi1&&sayi1<20);

        int sayi2=5;
        //sayi2'nin 10 ile 20arasında olmadigini true diyerek donduren bir kod yaziniz
        System.out.println(sayi2<10||sayi2<20);//*/true






    }
}
