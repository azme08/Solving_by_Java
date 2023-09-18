//Palindrome or Not 
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args){
     
       int num,sum=0,temp,res;
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       
       temp=num;
       while(temp !=0){
           res=temp%10;
           sum=sum*10+res;
           temp=temp/10;
           
       }
         if(sum==num){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not A Palindrome");
       }
    
    }
   
}
