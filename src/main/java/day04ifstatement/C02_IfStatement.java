package day04ifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {




    /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */

        int not = 0;

        if (not>=90 && not<=100) {
            System.out.println("not b cok iyi");


        } else if (not<90 && not>=80) {
            System.out.println("not b cok iyi");


        }else if (not<80 && not>=70) {
            System.out.println("not c orta");

        }else if (not<70 && not>=60) {
            System.out.println("not d gecer");

        }else {
            System.out.println("not f zayif");
        }




        }
}
