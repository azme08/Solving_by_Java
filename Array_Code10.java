//Simple Array Matrix Code
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      
      int[][] arr1 =new int[2][3];
      int[][] arr2 =new int[2][3];
     
    
        System.out.println("Enter elements for A matrix: ");
      for(int row=0;row<2;row++){
          for(int col=0;col<3;col++){
              System.out.printf("arr1[%d][%d] = ",row,col);
              arr1[row][col]=sc.nextInt();
          }
      }
      System.out.println("Enter elements for B matrix: ");
      for(int row=0;row<2;row++){
          for(int col=0;col<3;col++){
              System.out.printf("arr2[%d][%d] = ",row,col);
              arr2[row][col]=sc.nextInt();
          }
      }
      
      System.out.print("A = ");
       for(int row=0;row<2;row++){
          for(int col=0;col<3;col++){
              System.out.print(arr1[row][col]+" ");
          }
           
          System.out.println("");
          System.out.print("    ");
      }
       System.out.println("");
       
        
      
      System.out.print("B = ");
       for(int row=0;row<2;row++){
          for(int col=0;col<3;col++){
              System.out.print(arr2[row][col]+" ");
          }
           
          System.out.println("");
          System.out.print("    ");
      }
        System.out.println("");
        
        
    }
   
}

