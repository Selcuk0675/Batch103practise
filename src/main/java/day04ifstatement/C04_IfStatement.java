package day04ifstatement;

import java.util.Scanner;

public class C04_IfStatement {
     /*
 Print "Lutfen is unvaninizi girin
 jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
 Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
 Eger jobTitle  qa ise print is unvaniniz Quality Analyst
 test data: qa ise print Quality Analyst
 dev ise print Developer
 ba ise print Business Analyst
 pm ise print Project Manager
*/
     public static void main(String[] args) {

         Scanner input=new Scanner(System.in);
         System.out.println("Lutfen is unvanınızı giriniz");
         String jobtitle=input.nextLine().toLowerCase();

         if (jobtitle.equals("qa")){
             System.out.println("is unvaniniz quality analist");
         } else if (jobtitle.equals("dev")) {
             System.out.println("developer");
         }else if (jobtitle.equals("ba")) {
             System.out.println("busıness analyst");
         }else if (jobtitle.equals("pm")) {

             System.out.println("Project Manager");
         }



         }

}
