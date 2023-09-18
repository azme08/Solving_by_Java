//check_an_Armstrong_number
import java.util.Scanner;


public class Practice1 {

    public static void main(String[] args){
     
       int num,sum=0,temp,res;
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       
       temp=num;
       while(temp !=0){
           res=temp%10;
           sum=sum+res*res*res;
           temp=temp/10;
       }
       if(num==sum){
           System.out.println("Armstrong_number");
       }else{
           System.out.println("Not An Armstrong_number");
       }
      
    }
   
}
