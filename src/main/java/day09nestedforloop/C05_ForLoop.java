package day09nestedforloop;

import java.util.Scanner;

public class C05_ForLoop {

     // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen string bir ifade giriniz");
        String  str=input.nextLine();

        for (int i=0; i<str.length(); i++) {// ifadenin karakterlerine bakildi
            if (str.charAt(i)=='a' || str.charAt(i)==' ')
                continue;//a yada bosluk " " gorursen atla
                System.out.println(str.charAt(i));


        }



    }

}
