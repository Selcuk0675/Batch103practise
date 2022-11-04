package sorucozumleri;

public class Soru5 {
    public static void main(String[] args) {


        /*
                *********
                    *
                    *
                    *
                    *
         */

        for (int i=1;i<=5;i++) {
            for (int j=1;j<=9; j++){
                if (i==1||(i==2&&j==5)||(i==3&&j==5)||(i==4&&j==5)||(i==5&&j==5)){
                    System.out.print("S");
                }else System.out.print(" ");

            }
            System.out.println();
        }


    }
}
