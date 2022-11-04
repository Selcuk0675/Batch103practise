package day12_localdatetimeVarargsOverloadingOverriding;

public class C04_Varargs {
    public static void main(String[] args) {


        System.out.println(a1(true,false,true,true));
        a2(1,2,3,4);
    }

    private static void a2(int i, int... i2) {//burda sadece 1 deger gir sonra istedigin kadar girebilirsin
        System.out.println(i2.length);
    }

    private static int a1(boolean b, boolean... b3) {//eger int se asagida return yapmaliyiz
        return b3.length;// int yerine void olsaydi yukarida kırmızı olacakti
    }


}
