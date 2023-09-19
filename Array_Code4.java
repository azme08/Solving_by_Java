//Find Average in Array
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args){
     
        double avg;
       Scanner sc=new Scanner(System.in);
      
       double sum=0;
       
       double[] arr=new double[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextDouble();
            sum+=arr[i];
        }
       avg=sum/arr.length;
        System.out.println(avg);
    }
   
}
