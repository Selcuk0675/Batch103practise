package day07stringmanipulation;

public class C04_StringmanipulationStatWith {

    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String cumle="Kazananlar hic hata yapmayanlar degil,vazgecmeyenlerdir";
        // Ka ile basliyo m
        System.out.println(cumle.startsWith("Ka"));// buyuk kucuk harf onemli

        //dir ile bitiyor mu
        System.out.println(cumle.endsWith("dir"));//true

    }

}
