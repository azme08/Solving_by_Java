//Find Min and Max Value in a array

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args){
     
        
       Scanner sc=new Scanner(System.in);
      
       double[] arr=new double[5];
       
       for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextDouble();
       }
       double max=arr[0];
       double min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            
           
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
       
        
        
    }
   
}
