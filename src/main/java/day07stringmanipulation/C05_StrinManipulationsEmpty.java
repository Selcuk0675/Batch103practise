package day07stringmanipulation;

import java.util.Scanner;

public class C05_StrinManipulationsEmpty {

    public static void main(String[] args) {

        String str1="hi";
        System.out.println(str1.isEmpty());// false

        String str2="";// hiçlik
        System.out.println(str2.isEmpty());// true

        String str3=" ";// Space her zaman bir karakterdir
        System.out.println(str3.isEmpty());// false

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter string: ");
       String str99=input.nextLine();
        System.out.println(str99.isEmpty());





    }

}
