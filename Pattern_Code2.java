//Pattern with row and column
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args){
     
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       for(int row=n;row>=1;row--){
           for (int col = 1; col <= row; col++) {
               System.out.print(" "+col);
           }
           System.out.println();
       }
   
    }
   
}
