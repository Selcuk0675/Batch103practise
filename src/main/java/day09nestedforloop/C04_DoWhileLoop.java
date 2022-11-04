package day09nestedforloop;

public class C04_DoWhileLoop {
    /*

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
    Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
    int MuzSayısı =165, hayatta kalmaDays = 0;
    boolean maymunAlive = true;
    */


//Maymunun kac gun hayatta kalacagini gosteren kod
//Hayatta kaldigi suerece muz vermelisin(DO While)
//eger 4 ten az muz kalirsa maymunlar olur

    public static void main(String[] args) {

        int MuzSayisi=165;
        boolean MaymunAlive=true;
        int survivalDays=0;

        do {
            MuzSayisi=MuzSayisi-4;// her gun 4 muz eksiltir
            survivalDays++;

            if (MuzSayisi<4){
                MaymunAlive=false;
                System.out.println("bugun "+(survivalDays+1)+" yasayamadi  muz kalmadi maymun oldu");
            }else System.out.println("bugun "+survivalDays+" yasadi muz bitmedi maymun hayatta");

        }while (MaymunAlive);
        System.out.println("Toplam maymunun yasadigi gun sayisi "+(survivalDays -1));






    }
}
