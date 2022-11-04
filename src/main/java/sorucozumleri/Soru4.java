package sorucozumleri;

public class Soru4 {

    public static void main(String[] args) {

        /*

         *           sekildeki gorulen ucgeni yazdiriniz
       *   *
      *     *
     *       *             1234 5 6789
     *********

         */

        for (int i=1; i<=5;i++){
            for (int j=1; j<=9; j++){

                if (i==1&&j==5||i==2&&(j==4||j==6)||i==3&&(j==3||j==7)||i==4&&(j==2||j==8)||i==5){
                    System.out.print("*");
                }else System.out.print(" ");


            }

            System.out.println();
        }


    }

}
