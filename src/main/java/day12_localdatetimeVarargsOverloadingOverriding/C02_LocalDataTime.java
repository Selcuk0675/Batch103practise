package day12_localdatetimeVarargsOverloadingOverriding;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class C02_LocalDataTime {
    public static void main(String[] args) {

/* Tom 29 Ekim 1923 tarihinden 45 yil 8 ay 5 gun sonra dogdu.
   Veli 15 Eylul 1993 tarihinden 24 yil 2 ay 11 gun sonra dogdu.
   Tom ve Veli'nin dogum tarihini hesaplayan kodu yazıniz.
   Tom ve Veli'nin dogum tarihlerinin aynı olup olmadığını kontrol eden kodu yazıniz.
 */

        LocalDate tom= LocalDate.of(1923, Month.OCTOBER,29).plusYears(45).plusMonths(8).plusMonths(5);
        System.out.println(tom);

        LocalDate veli=LocalDate.of(1993,9,15).plusYears(24).plusMonths(2).plusDays(11);
        System.out.println(veli);

        boolean esitMi=tom.isEqual(veli);
        System.out.println(esitMi);

      //Iki saat dilimi arasindaki farki hesaplama
     //Japonya ile Almanya arasindaki saat farkini saat cinsinden hesaplatan kodu yaziniz

        LocalDateTime japan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime german=LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark= ChronoUnit.HOURS.between(japan,german);
        System.out.println(fark);

        //Ex: Tarih 2022-10-31 ve saat 03:26:00pm.oldugunda asagidaki kod ne yazdirir?
        LocalTime time=LocalTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm");//00:37
        System.out.println(dtf.format(time.plusHours(2)));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm");//09:37
        System.out.println(dtf2.format(time.minusHours(1)));

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf3.format(time.minusHours(1)));//02:26:00

        //gun ay yil olarak yazdirma
        LocalDate date=LocalDate.now();
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd_MMMM_yy");
        System.out.println(dtf4);

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("MM_dd_yyyy");
        System.out.println(dtf5);

        //Mevcut saat diliminden ileri gitmek
        //Mevcut saat diliminden 2 saat ileriyi yazdirin

        LocalTime time2=LocalTime.now();
        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf6.format(time2.plusHours(2)));



    }
}
