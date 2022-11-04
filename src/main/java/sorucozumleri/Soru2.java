package sorucozumleri;

public class Soru2 {
    public static void main(String[] args) {


      /*  Example 2:Asagıdaki sekli cizen kodu yaziniz
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

                */

        for (int i=1;i<=5;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
