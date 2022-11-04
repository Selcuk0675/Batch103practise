package day07stringmanipulation;

public class C07_StringManipulationIndexOf {
    public static void main(String[] args) {

           /*
           String str = "Kara kara dusunme Ankara";
        //indexOf() method'u verilen character veya caharacter'lerin "ilk gorunumunun" index'ini verir.
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1);//5


        //lastIndexOf() method'u verilen character veya caharacter'lerin "son gorunumunun" index'ini verir.
        int idxA2 = str.lastIndexOf("kara");//20 bastan Ankara'nin kara'si
        System.out.println(idxA2);
         */
//Ex: Verilen bir String'deki bir character'in tekrarli veya
// tekrarsiz olup olmadigini gosteren kodu yaziniz

        String str="Javacancandir";
        char ch='a';
        if (str.indexOf(ch)==str.lastIndexOf(ch)){
            System.out.println("tekrarsiz");
        }else System.out.println("tekrarli");

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
       // @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
       // @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

        String mail="@bnlşfbişifböi @gmail.com";
        String arananmetin="@gmail.com";

        if (!mail.contains(arananmetin)) {

            System.out.println("lutfen gmail adresi giriniz");
        } else if (mail.endsWith(arananmetin)) {
            System.out.println("Email adresiniz kaydedildi ");
        }else System.out.println("\"lutfen yazimı kontrol edin\"");




    }
}
