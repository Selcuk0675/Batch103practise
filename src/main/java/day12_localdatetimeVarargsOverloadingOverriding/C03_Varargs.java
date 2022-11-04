package day12_localdatetimeVarargsOverloadingOverriding;

public class C03_Varargs {
    public static void main(String[] args) {

        //Verilen String ifadeleri birlestiren cocat () isimli bir method olusturnuz.Varargs kullaniniz

        concat("Safran","Bolu","evleri");

    }
    private static void concat(String...str){
        String sonuc="";
        for (String w:str
        ) {
            sonuc+=w;
        }
        System.out.println(sonuc);
    }
}
