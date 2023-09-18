//Basic Addition in array
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args){
     
       Scanner sc=new Scanner(System.in);
       int sum=0;
       
       int[] arr=new int[5];
       
       arr[0]=sc.nextInt();
       arr[1]=sc.nextInt();
       arr[2]=sc.nextInt();
       arr[3]=sc.nextInt();
       arr[4]=sc.nextInt();
       
       sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
       
        System.out.println(sum);
    }
   
}
