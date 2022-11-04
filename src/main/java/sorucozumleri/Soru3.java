package sorucozumleri;

public class Soru3 {
    public static void main(String[] args) {

         /*
        Example 3:Asagıdaki sekli cizen kodu yaziniz

              * * * *
              * * *
              * *
              *

         */
        for (int i=1;i<=4;i++) {
            for (int j=4 ;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
