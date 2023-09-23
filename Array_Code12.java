//Sum of Diagonal Matrix,upper and lower triangle 

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        
        //input Matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col]=sc.nextInt();
            }
        }
        int sum=0,upper=0,lower=0;
        //Diagonal,Upper,Lower triangle addition
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if(row==col){
                    sum +=arr[row][col];
                }
                
                if(row<col){
                    upper +=arr[row][col];
                }
                if(row>col){
                    lower +=arr[row][col];
                }
            }
        }
        
        System.out.println("Sum of Diagonal Elements: "+sum);
        System.out.println("Sum of Upper Elements: "+upper);
        System.out.println("Sum of lower Elements: "+lower);
        
    }
   
}
