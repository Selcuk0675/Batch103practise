package turgay;

public class C01_Forloop {
    public static void main(String[] args) {

        //120 den 10 kadar olan ve 4 ebolunebilen sayilarin toplamini yaziniz

        //forloop
        int sum=0;
        for (int i=120;i>9;i--){

            if (i%4==0){
                sum=sum+i;

            }

        }
        System.out.print(sum+" ");

        //While loop
        int top=0;
        int i=120;
        while(i>9){
            if (i%4==0){
                System.out.println(i+" ");
            }
            i--;
        }
        System.out.println(top);

        //do-while
        int k=120;
        int t=0;
        do {
            if (k%4==0){
                t=t+k;
                System.out.println(k +" ");
            }
            k--;
        }while (k>9);




    }


}
